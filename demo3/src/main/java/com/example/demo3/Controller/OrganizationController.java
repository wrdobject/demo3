package com.example.demo3.Controller;

import com.alibaba.fastjson.JSON;
import com.example.demo3.Pojo.Organization;
import com.example.demo3.Service.OrganizationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@Api(value = "Sample1",description = "机构管理范例相关接口",produces = MediaType.ALL_VALUE)
@RestController
public class OrganizationController {
    @Autowired
    private OrganizationService organizationService;
    @ApiOperation(value = "机构添加",notes = "机构添加页信息（*号为必填项）",httpMethod = "GET",produces = MediaType.ALL_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ofcPrtNm",value = "上级机构",dataType = "String"),
            @ApiImplicitParam(name="cntrCd",value="国家代码",required = true,dataType = "int"),
            @ApiImplicitParam(name="stateCd",value="州省代码",required = true,dataType = "int"),
            @ApiImplicitParam(name="cityCd",value="城市代码",required = true,dataType = "int"),
            @ApiImplicitParam(name="ofcNm",value="机构名称",required = true,dataType = "String"),
            @ApiImplicitParam(name="ofcCode",value="机构编码",dataType = "int"),
            @ApiImplicitParam(name="ofcType",value="机构类型",dataType = "String"),
            @ApiImplicitParam(name="ofcGrd",value="机构级别",dataType = "String"),
            @ApiImplicitParam(name="fstCntctPersId",value="主负责人",dataType = "String"),
            @ApiImplicitParam(name="secCntctPersId",value="副负责人",dataType = "String"),
            @ApiImplicitParam(name="acctOfcId",value="记账机构",dataType = "String"),
            @ApiImplicitParam(name="acctStdId",value="会计核算准则",dataType = "String"),
            @ApiImplicitParam(name="ofcAddr",value="联系地址",dataType = "String"),
            @ApiImplicitParam(name="ofcTel",value="电话",dataType = "String"),
            @ApiImplicitParam(name="ofcZip",value="邮政编码",dataType = "String"),
            @ApiImplicitParam(name="ofcFax",value="传真",dataType = "String"),
            @ApiImplicitParam(name="ofcSpvsId",value="负责人",dataType = "String"),
    })

    @GetMapping("/insert_Organization")
    public Object Insert_Organization(@RequestParam(required = false) String ofcPrtNm,
                                      @RequestParam int cntrCd,
                                      @RequestParam int stateCd,
                                      @RequestParam int cityCd,
                                      @RequestParam String ofcNm,
                                      @RequestParam(required = false,defaultValue = "0") int ofcCode,
                                      @RequestParam(required = false) String ofcType,
                                      @RequestParam(required = false) String ofcGrd,
                                      @RequestParam(required = false) String fstCntctPersId,
                                      @RequestParam(required = false) String secCntctPersId,
                                      @RequestParam(required = false) String acctOfcId,
                                      @RequestParam(required = false) String acctStdId,
                                      @RequestParam(required = false) String ofcAddr,
                                      @RequestParam(required = false) String ofcTel,
                                      @RequestParam(required = false) String ofcZip,
                                      @RequestParam(required = false) String ofcFax,
                                      @RequestParam(required = false) String ofcSpvsId){
        Object object="";
        Organization organization=new Organization();
        organization.setAcctOfcId(acctOfcId);
        organization.setAcctStdId(acctStdId);
        organization.setCityCd(cityCd);
        organization.setCntrCd(cntrCd);
        organization.setFstCntctPersId(fstCntctPersId);
        organization.setOfcAddr(ofcAddr);
        organization.setOfcCode(ofcCode);
        organization.setOfcFax(ofcFax);
        organization.setOfcGrd(ofcGrd);
        organization.setOfcNm(ofcNm);
        organization.setOfcPrtNm(ofcPrtNm);
        organization.setOfcSpvsId(ofcSpvsId);
        organization.setOfcTel(ofcTel);
        organization.setOfcType(ofcType);
        organization.setOfcZip(ofcZip);
        organization.setSecCntctPersId(secCntctPersId);
        organization.setStateCd(stateCd);
        int row=organizationService.Insert_O(organization);
        if(row>0){
            object="{\"flag\":\"添加成功\"}";
        }else{
            object="{\"flag\":\"添加失败\"}";
        }
        return object;
    }
    @ApiOperation(value = "机构修改",notes = "机构修改页信息",httpMethod = "PUT",produces = MediaType.ALL_VALUE)
    @ApiImplicitParam(name="ofcId",value="上级机构id",required = true,dataType = "int")
    @PutMapping("/Update_Organization/{ofcId}")
    public Object Update_Organization(
                                    @PathVariable("ofcId") int ofcId,
                                    Organization organization
                                    ){
        System.out.println(ofcId);
        System.out.println(organization.getCityCd());
        organization.setOfcId(ofcId);
        int row=organizationService.Update_O(organization);
        List<Organization> list=null;
        if(row>0){
            list=organizationService.Select_O(organization);
        }
        return JSON.toJSONString(list);
    }
    @ApiOperation(value = "机构模糊查询",notes = "机构模糊查询页信息（*号为必填项）",httpMethod = "POST",produces = MediaType.ALL_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ofcPrtNm", value = "上级机构",required = false,dataType = "String"),
            @ApiImplicitParam(name = "ofcCode", value = "机构编码", required = false,dataType = "int")
    })
    @PostMapping("/Select_Organization")
    public Object Select_Organization(@RequestParam(required = false) String ofcPrtNm,
                                      @RequestParam(required = false,defaultValue = "0") int ofcCode){
        Organization organization=new Organization();
        if(ofcPrtNm !=null){
            organization.setOfcPrtNm(ofcPrtNm);
        }
        if(ofcCode>0){
            organization.setOfcCode(ofcCode);
        }
        List<Organization> list=organizationService.Select_O(organization);
        HashMap<String, Object> map = new HashMap<>();
        map.put("total", 1);
        map.put("list", list);
        return JSON.toJSONString(map);
    }
    @ApiOperation(value = "删除机构",notes = "删除机构根据机构id删除",httpMethod = "DELETE",produces = MediaType.ALL_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ofcId",value = "上级机构id",required = true,dataType = "int")
    })
    @DeleteMapping("/Delect_Organization/{ofcId}")
    public Object Delect_Organization(@PathVariable int ofcId ){
        Organization organization=new Organization();
        organization.setOfcId(ofcId);
        Object object="";
        int row=organizationService.Delete_O(organization);
        if(row>0){
            object="{\"flag\":\"删除成功\"}";
        }else{
            object="{\"flag\":\"删除失败\"}";
        }
        return object;
    }
}

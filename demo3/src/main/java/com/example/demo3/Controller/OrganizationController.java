package com.example.demo3.Controller;

import com.example.demo3.Pojo.Organization;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api(value = "Sample1",description = "机构管理范例相关接口",produces = MediaType.ALL_VALUE)
@RestController
public class OrganizationController {
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
        int row=1;
        if(row>0){
            object="{\"flag\":\"添加成功\"}";
        }else{
            object="{\"flag\":\"添加失败\"}";
        }
        return object;
    }
    @ApiOperation(value = "机构修改",notes = "机构修改页信息",httpMethod = "GET",produces = MediaType.ALL_VALUE)
    @ApiImplicitParam(name="ofcId",value="上级机构id",required = true,dataType = "int")
    @GetMapping("/Update_Organization/{ofcId}")
    public Object Update_Organization(
                                    @PathVariable("ofcId") String ofcId,
                                    Organization organization
                                    ){
        Object object="";
        int row=1;
        if(row>0){
            object="{\"flag\":\"修改成功\"}";
        }else{
            object="{\"flag\":\"修改失败\"}";
        }
        return object;
    }
    @ApiOperation(value = "机构模糊查询",notes = "机构模糊查询页信息（*号为必填项）",httpMethod = "POST",produces = MediaType.ALL_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ofcPrtNm", value = "上级机构",required = false,dataType = "String"),
            @ApiImplicitParam(name = "ofcCode", value = "机构编码", required = false,dataType = "int")
    })
    @PostMapping("/Select_Organization")
    public Object Select_Organization(@RequestParam(required = false) String ofcPrtNm,
                                      @RequestParam(required = false,defaultValue = "0") int ofcCode){
        Object object="";
        int row=1;
        if(row>0){
            object="{\"flag\":\"查询结果显示\"}";
        }else{
            object="{\"flag\":\"查询失败\"}";
        }
        return object;
    }
}

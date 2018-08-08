package com.example.demo3.Controller;

import com.example.demo3.Pojo.Flights;
import com.example.demo3.Service.FlightsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Api(value = "Sample",description = "连接数据库范例相关接口",produces = MediaType.ALL_VALUE)
@RestController
public class FlightsController {
    @Autowired
    private FlightsService flightsService;
    @ApiOperation(value = "航班信息查询（支持模糊查询）",notes = "航班页信息（*号为必填项）",httpMethod = "GET",produces = MediaType.ALL_VALUE)
    @GetMapping("/select")
    @ResponseBody
    @ApiImplicitParams({
            @ApiImplicitParam(name = "flight_code",value = "航班编号",required = true,dataType = "String"),
            @ApiImplicitParam(name="airline",value="航空公司",required = true,dataType = "String")
    })
    public Object getAll(
                      @RequestParam String flight_code,
                      @RequestParam String airline){
        Flights flights = new Flights();
        flights.setFlight_code(flight_code);
        flights.setAirline(airline);
        return  flightsService.selectAll(flights);
    }
    @ApiOperation(value = "添加航班信息",notes = "添加页信息",httpMethod = "POST",produces = MediaType.ALL_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "flight_code",value = "航班编号",required = true,dataType = "String"),
            //@ApiImplicitParam(name = "flight_date",value = "航班时间",required = true,dataType = "Date"),
            @ApiImplicitParam(name = "airline",value = "航空公司",required = true,dataType = "String"),
            @ApiImplicitParam(name = "type",value = "机型",required = true,dataType = "String"),
            @ApiImplicitParam(name = "take_airport_id",value = "起飞机场（外键）",required = true,defaultValue = "1",dataType = "int"),
            @ApiImplicitParam(name = "landing_airport_id",value = "降落机场（外键）",required = true,defaultValue = "2",dataType = "int")
    })
    @PostMapping("/Insert")
    @ResponseBody
    public Object insert(@RequestParam String flight_code,
                         //@RequestParam(defaultValue = "2018-08-08") Date flight_date,
                         @RequestParam String airline,
                         @RequestParam String type,
                         @RequestParam(defaultValue = "1") int take_airport_id,
                         @RequestParam(defaultValue = "2") int landing_airport_id
                         ){
        Object object="";
        Flights flights=new Flights();
        flights.setFlight_code(flight_code);
        flights.setFlight_date(new Date());
        flights.setAirline(airline);
        flights.setType(type);
        flights.setTake_airport_id(take_airport_id);
        flights.setLanding_airport_id(landing_airport_id);
        int row=flightsService.Insert(flights);
        if(row>0){
            object="{\"flag\":\"添加成功\"}";
        }else{
            object="{\"flag\":\"添加失败\"}";
        }
        return object;
    }
    @ApiOperation(value = "删除航班信息",notes = "删除页信息",httpMethod = "POST",produces = MediaType.ALL_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "航班id",required = true,dataType = "int"),
    })
    @PostMapping("/delete")
    public Object DeleteById(@RequestParam int id){
        Object object="";
        Flights flights=new Flights();
        flights.setId(id);
        int row=flightsService.Delect(flights);
        if(row>0){
            object="{\"flag\":\"删除成功\"}";
        }else{
            object="{\"flag\":\"删除失败\"}";
        }
        return object;
    }
    @ApiOperation(value = "修改航班信息",notes = "修改页信息",httpMethod = "POST",produces = MediaType.ALL_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "航班id",required = true,dataType = "int"),
            @ApiImplicitParam(name = "flight_code",value = "航班编号",dataType = "String"),
            //@ApiImplicitParam(name = "flight_date",value = "航班时间",required = true,dataType = "Date"),
            @ApiImplicitParam(name = "airline",value = "航空公司",dataType = "String"),
            @ApiImplicitParam(name = "type",value = "机型",dataType = "String"),
            @ApiImplicitParam(name = "take_airport_id",value = "起飞机场（外键）",dataType = "int"),
            @ApiImplicitParam(name = "landing_airport_id",value = "降落机场（外键）",dataType = "int")
    })
    @PostMapping("/update")
    public Object UpdateById(@RequestParam int id,
                            @RequestParam(required = false) String flight_code,
                             //@RequestParam(defaultValue = "2018-08-08") Date flight_date,
                             @RequestParam(required = false) String airline,
                             @RequestParam(required = false) String type,
                             @RequestParam(required = false,defaultValue = "0") int take_airport_id,
                             @RequestParam(required = false,defaultValue = "0") int landing_airport_id){
        Object object="";
        System.out.println(airline);
        Flights flights=new Flights();
        flights.setId(id);
        flights.setFlight_code(flight_code);
        flights.setAirline(airline);
        flights.setType(type);
        flights.setTake_airport_id(take_airport_id);
        flights.setLanding_airport_id(landing_airport_id);
        int row=flightsService.Update(flights);
        if(row>0){
            object="{\"flag\":\"修改成功\"}";
        }else{
            object="{\"flag\":\"修改失败\"}";
        }
        return object;
    }
}

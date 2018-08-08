package com.example.demo3.Pojo;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@ApiModel(value = "Flights对象",description = "航班信息实体类")
public class Flights {
    @ApiModelProperty(value = "航班id",name = "id",example = "1")
    private int id;
    @ApiModelProperty(value = "航班编号",name = "flight_code")
    private String flight_code;
    @ApiModelProperty(value = "航班时间",name = "flight_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date flight_date;
    @ApiModelProperty(value = "航空公司",name = "airline")
    private String airline;
    @ApiModelProperty(value = "机型",name = "type")
    private String type;
    @ApiModelProperty(value = "起飞机场（外键）",name = "take_airport_id")
    private int take_airport_id;
    @ApiModelProperty(value = "降落机场（外键）",name = "landing_airport_id")
    private int landing_airport_id;
    @ApiModelProperty(value = "起飞时间",name = "take_time")
    private Date take_time;
    @ApiModelProperty(value = "降落时间",name = "landing_time")
    private Date landing_time;
    @ApiModelProperty(value = "飞行时长",name = "flight_time")
    private String flight_time;
    @ApiModelProperty(value = "参考报价",name = "reference_price")
    private int reference_price;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlight_code() {
        return flight_code;
    }

    public void setFlight_code(String flight_code) {
        this.flight_code = flight_code;
    }

    public Date getFlight_date() {
        return flight_date;
    }

    public void setFlight_date(Date flight_date) {
        this.flight_date = flight_date;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTake_airport_id() {
        return take_airport_id;
    }

    public void setTake_airport_id(int take_airport_id) {
        this.take_airport_id = take_airport_id;
    }

    public int getLanding_airport_id() {
        return landing_airport_id;
    }

    public void setLanding_airport_id(int landing_airport_id) {
        this.landing_airport_id = landing_airport_id;
    }

    public Date getTake_time() {
        return take_time;
    }

    public void setTake_time(Date take_time) {
        this.take_time = take_time;
    }

    public Date getLanding_time() {
        return landing_time;
    }

    public void setLanding_time(Date landing_time) {
        this.landing_time = landing_time;
    }

    public String getFlight_time() {
        return flight_time;
    }

    public void setFlight_time(String flight_time) {
        this.flight_time = flight_time;
    }

    public int getReference_price() {
        return reference_price;
    }

    public void setReference_price(int reference_price) {
        this.reference_price = reference_price;
    }
}

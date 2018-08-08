package com.example.demo3.Pojo;

import io.swagger.annotations.ApiModelProperty;

public class Organization {
    @ApiModelProperty(value = "上级机构id",name = "ofcId")
    private  int ofcId;
    @ApiModelProperty(value = "上级机构",name = "ofcPrtNm")
    private  String ofcPrtNm;
    @ApiModelProperty(value = "国家代码",name = "cntrCd")
    private int cntrCd;
    @ApiModelProperty(value = "州省代码",name = "stateCd")
    private int stateCd;
    @ApiModelProperty(value = "城市代码",name = "cityCd")
    private int cityCd;
    @ApiModelProperty(value = "机构名称",name = "ofcNm")
    private String ofcNm;
    @ApiModelProperty(value = "机构编码",name = "ofcCode")
    private  int ofcCode;
    @ApiModelProperty(value = "机构类型",name = "ofcType")
    private String ofcType;
    @ApiModelProperty(value = "机构级别",name = "ofcGrd")
    private String ofcGrd;
    @ApiModelProperty(value = "主负责人",name = "fstCntctPersId")
    private String fstCntctPersId;
    @ApiModelProperty(value = "副负责人",name = "secCntctPersId")
    private String secCntctPersId;
    @ApiModelProperty(value = "记账机构",name = "acctOfcId")
    private String acctOfcId;
    @ApiModelProperty(value = "会计核算准则",name = "acctStdId")
    private String acctStdId;
    @ApiModelProperty(value = "联系地址",name = "ofcAddr")
    private String ofcAddr;
    @ApiModelProperty(value = "电话",name = "ofcTel")
    private String ofcTel;
    @ApiModelProperty(value = "邮政编码",name = "ofcZip")
    private String ofcZip;
    @ApiModelProperty(value = "传真",name = "ofcFax")
    private String ofcFax;
    @ApiModelProperty(value = "负责人",name = "ofcSpvsId")
    private String ofcSpvsId;

    public int getOfcId() {
        return ofcId;
    }

    public void setOfcId(int ofcId) {
        this.ofcId = ofcId;
    }

    public String getOfcPrtNm() {
        return ofcPrtNm;
    }

    public void setOfcPrtNm(String ofcPrtNm) {
        this.ofcPrtNm = ofcPrtNm;
    }

    public int getCntrCd() {
        return cntrCd;
    }

    public void setCntrCd(int cntrCd) {
        this.cntrCd = cntrCd;
    }

    public int getStateCd() {
        return stateCd;
    }

    public void setStateCd(int stateCd) {
        this.stateCd = stateCd;
    }

    public int getCityCd() {
        return cityCd;
    }

    public void setCityCd(int cityCd) {
        this.cityCd = cityCd;
    }

    public String getOfcNm() {
        return ofcNm;
    }

    public void setOfcNm(String ofcNm) {
        this.ofcNm = ofcNm;
    }

    public int getOfcCode() {
        return ofcCode;
    }

    public void setOfcCode(int ofcCode) {
        this.ofcCode = ofcCode;
    }

    public String getOfcType() {
        return ofcType;
    }

    public void setOfcType(String ofcType) {
        this.ofcType = ofcType;
    }

    public String getOfcGrd() {
        return ofcGrd;
    }

    public void setOfcGrd(String ofcGrd) {
        this.ofcGrd = ofcGrd;
    }

    public String getFstCntctPersId() {
        return fstCntctPersId;
    }

    public void setFstCntctPersId(String fstCntctPersId) {
        this.fstCntctPersId = fstCntctPersId;
    }

    public String getSecCntctPersId() {
        return secCntctPersId;
    }

    public void setSecCntctPersId(String secCntctPersId) {
        this.secCntctPersId = secCntctPersId;
    }

    public String getAcctOfcId() {
        return acctOfcId;
    }

    public void setAcctOfcId(String acctOfcId) {
        this.acctOfcId = acctOfcId;
    }

    public String getAcctStdId() {
        return acctStdId;
    }

    public void setAcctStdId(String acctStdId) {
        this.acctStdId = acctStdId;
    }

    public String getOfcAddr() {
        return ofcAddr;
    }

    public void setOfcAddr(String ofcAddr) {
        this.ofcAddr = ofcAddr;
    }

    public String getOfcTel() {
        return ofcTel;
    }

    public void setOfcTel(String ofcTel) {
        this.ofcTel = ofcTel;
    }

    public String getOfcZip() {
        return ofcZip;
    }

    public void setOfcZip(String ofcZip) {
        this.ofcZip = ofcZip;
    }

    public String getOfcFax() {
        return ofcFax;
    }

    public void setOfcFax(String ofcFax) {
        this.ofcFax = ofcFax;
    }

    public String getOfcSpvsId() {
        return ofcSpvsId;
    }

    public void setOfcSpvsId(String ofcSpvsId) {
        this.ofcSpvsId = ofcSpvsId;
    }
}
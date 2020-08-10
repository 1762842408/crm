package com.hqyj.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author LJ
 * @since 2020-08-09
 */
public class SaleChance extends Model<SaleChance> {

    private static final long serialVersionUID=1L;

    private Integer sId;

    private String sName;

    private String sSource;

    private Integer sTel;

    private String sProbability;

    private String sSummary;

    private String sDescribe;

    private String sCreator;

    private LocalDate sCreatetime;

    private String sAssign;

    private LocalDate sAssigntime;

    private String sState;


    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsSource() {
        return sSource;
    }

    public void setsSource(String sSource) {
        this.sSource = sSource;
    }

    public Integer getsTel() {
        return sTel;
    }

    public void setsTel(Integer sTel) {
        this.sTel = sTel;
    }

    public String getsProbability() {
        return sProbability;
    }

    public void setsProbability(String sProbability) {
        this.sProbability = sProbability;
    }

    public String getsSummary() {
        return sSummary;
    }

    public void setsSummary(String sSummary) {
        this.sSummary = sSummary;
    }

    public String getsDescribe() {
        return sDescribe;
    }

    public void setsDescribe(String sDescribe) {
        this.sDescribe = sDescribe;
    }

    public String getsCreator() {
        return sCreator;
    }

    public void setsCreator(String sCreator) {
        this.sCreator = sCreator;
    }

    public LocalDate getsCreatetime() {
        return sCreatetime;
    }

    public void setsCreatetime(LocalDate sCreatetime) {
        this.sCreatetime = sCreatetime;
    }

    public String getsAssign() {
        return sAssign;
    }

    public void setsAssign(String sAssign) {
        this.sAssign = sAssign;
    }

    public LocalDate getsAssigntime() {
        return sAssigntime;
    }

    public void setsAssigntime(LocalDate sAssigntime) {
        this.sAssigntime = sAssigntime;
    }

    public String getsState() {
        return sState;
    }

    public void setsState(String sState) {
        this.sState = sState;
    }

    @Override
    protected Serializable pkVal() {
        return this.sId;
    }

    @Override
    public String toString() {
        return "SaleChance{" +
        "sId=" + sId +
        ", sName=" + sName +
        ", sSource=" + sSource +
        ", sTel=" + sTel +
        ", sProbability=" + sProbability +
        ", sSummary=" + sSummary +
        ", sDescribe=" + sDescribe +
        ", sCreator=" + sCreator +
        ", sCreatetime=" + sCreatetime +
        ", sAssign=" + sAssign +
        ", sAssigntime=" + sAssigntime +
        ", sState=" + sState +
        "}";
    }
}

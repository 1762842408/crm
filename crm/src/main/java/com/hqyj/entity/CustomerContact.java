package com.hqyj.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author LJ
 * @since 2020-08-09
 */
public class CustomerContact extends Model<CustomerContact> {

    private static final long serialVersionUID=1L;

    private Integer ccId;

    private String ccName;

    private String ccSex;

    private String ccJob;

    private Integer ccPhone;

    private Integer ccTel;

    private String ccNote;

    private Integer cId;


    public Integer getCcId() {
        return ccId;
    }

    public void setCcId(Integer ccId) {
        this.ccId = ccId;
    }

    public String getCcName() {
        return ccName;
    }

    public void setCcName(String ccName) {
        this.ccName = ccName;
    }

    public String getCcSex() {
        return ccSex;
    }

    public void setCcSex(String ccSex) {
        this.ccSex = ccSex;
    }

    public String getCcJob() {
        return ccJob;
    }

    public void setCcJob(String ccJob) {
        this.ccJob = ccJob;
    }

    public Integer getCcPhone() {
        return ccPhone;
    }

    public void setCcPhone(Integer ccPhone) {
        this.ccPhone = ccPhone;
    }

    public Integer getCcTel() {
        return ccTel;
    }

    public void setCcTel(Integer ccTel) {
        this.ccTel = ccTel;
    }

    public String getCcNote() {
        return ccNote;
    }

    public void setCcNote(String ccNote) {
        this.ccNote = ccNote;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    @Override
    protected Serializable pkVal() {
        return this.ccId;
    }

    @Override
    public String toString() {
        return "CustomerContact{" +
        "ccId=" + ccId +
        ", ccName=" + ccName +
        ", ccSex=" + ccSex +
        ", ccJob=" + ccJob +
        ", ccPhone=" + ccPhone +
        ", ccTel=" + ccTel +
        ", ccNote=" + ccNote +
        ", cId=" + cId +
        "}";
    }
}

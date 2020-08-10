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
public class BusinessRecord extends Model<BusinessRecord> {

    private static final long serialVersionUID=1L;

    private Integer bId;

    private String bContent;

    private LocalDate bTime;

    private String bArea;

    private String bSummary;

    private String bNote;

    private Integer bCid;


    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getbContent() {
        return bContent;
    }

    public void setbContent(String bContent) {
        this.bContent = bContent;
    }

    public LocalDate getbTime() {
        return bTime;
    }

    public void setbTime(LocalDate bTime) {
        this.bTime = bTime;
    }

    public String getbArea() {
        return bArea;
    }

    public void setbArea(String bArea) {
        this.bArea = bArea;
    }

    public String getbSummary() {
        return bSummary;
    }

    public void setbSummary(String bSummary) {
        this.bSummary = bSummary;
    }

    public String getbNote() {
        return bNote;
    }

    public void setbNote(String bNote) {
        this.bNote = bNote;
    }

    public Integer getbCid() {
        return bCid;
    }

    public void setbCid(Integer bCid) {
        this.bCid = bCid;
    }

    @Override
    protected Serializable pkVal() {
        return this.bId;
    }

    @Override
    public String toString() {
        return "BusinessRecord{" +
        "bId=" + bId +
        ", bContent=" + bContent +
        ", bTime=" + bTime +
        ", bArea=" + bArea +
        ", bSummary=" + bSummary +
        ", bNote=" + bNote +
        ", bCid=" + bCid +
        "}";
    }
}

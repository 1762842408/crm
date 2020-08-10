package com.hqyj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author LJ
 * @since 2020-08-09
 */
public class CustomerPlan extends Model<CustomerPlan> {

    private static final long serialVersionUID=1L;

    @TableId(value = "cp_id", type = IdType.AUTO)
    private Integer cpId;

    private String cpContent;

    private Integer cpUid;

    private Integer cpSid;


    public Integer getCpId() {
        return cpId;
    }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }

    public String getCpContent() {
        return cpContent;
    }

    public void setCpContent(String cpContent) {
        this.cpContent = cpContent;
    }

    public Integer getCpUid() {
        return cpUid;
    }

    public void setCpUid(Integer cpUid) {
        this.cpUid = cpUid;
    }

    public Integer getCpSid() {
        return cpSid;
    }

    public void setCpSid(Integer cpSid) {
        this.cpSid = cpSid;
    }

    @Override
    protected Serializable pkVal() {
        return this.cpId;
    }

    @Override
    public String toString() {
        return "CustomerPlan{" +
        "cpId=" + cpId +
        ", cpContent=" + cpContent +
        ", cpUid=" + cpUid +
        ", cpSid=" + cpSid +
        "}";
    }
}

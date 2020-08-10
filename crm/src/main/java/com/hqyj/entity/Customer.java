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
public class Customer extends Model<Customer> {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "c_id", type = IdType.AUTO)
    private Integer cId;

    /**
     * 客户满意度
     */
    private Integer cSatisficing;

    /**
     * 客户名称
     */
    private String cName;

    /**
     * 客户性别
     */
    private String cSex;

    /**
     * 客户状态
     */
    private String cStatus;

    /**
     * 信用额度
     */
    private String cCreditline;

    /**
     * 客户等级
     */
    private String cEstate;


    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getcSatisficing() {
        return cSatisficing;
    }

    public void setcSatisficing(Integer cSatisficing) {
        this.cSatisficing = cSatisficing;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcSex() {
        return cSex;
    }

    public void setcSex(String cSex) {
        this.cSex = cSex;
    }

    public String getcStatus() {
        return cStatus;
    }

    public void setcStatus(String cStatus) {
        this.cStatus = cStatus;
    }

    public String getcCreditline() {
        return cCreditline;
    }

    public void setcCreditline(String cCreditline) {
        this.cCreditline = cCreditline;
    }

    public String getcEstate() {
        return cEstate;
    }

    public void setcEstate(String cEstate) {
        this.cEstate = cEstate;
    }

    @Override
    protected Serializable pkVal() {
        return this.cId;
    }

    @Override
    public String toString() {
        return "Customer{" +
        "cId=" + cId +
        ", cSatisficing=" + cSatisficing +
        ", cName=" + cName +
        ", cSex=" + cSex +
        ", cStatus=" + cStatus +
        ", cCreditline=" + cCreditline +
        ", cEstate=" + cEstate +
        "}";
    }
}

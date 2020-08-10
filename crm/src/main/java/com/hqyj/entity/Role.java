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
public class Role extends Model<Role> {

    private static final long serialVersionUID=1L;

    @TableId(value = "r_id", type = IdType.AUTO)
    private Integer rId;

    private String rRole;


    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrRole() {
        return rRole;
    }

    public void setrRole(String rRole) {
        this.rRole = rRole;
    }

    @Override
    protected Serializable pkVal() {
        return this.rId;
    }

    @Override
    public String toString() {
        return "Role{" +
        "rId=" + rId +
        ", rRole=" + rRole +
        "}";
    }
}

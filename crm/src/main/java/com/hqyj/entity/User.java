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
public class User extends Model<User> {

    private static final long serialVersionUID=1L;

    @TableId(value = "u_id", type = IdType.AUTO)
    private Integer uId;

    private String uName;

    private String uSex;
   
	private Integer uAge;

    private Integer uRid;

    private String uPassword;
    
    public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex;
    }

    public Integer getuAge() {
        return uAge;
    }

    public void setuAge(Integer uAge) {
        this.uAge = uAge;
    }

    public Integer getuRid() {
        return uRid;
    }

    public void setuRid(Integer uRid) {
        this.uRid = uRid;
    }

    @Override
    protected Serializable pkVal() {
        return this.uId;
    }

    @Override
    public String toString() {
        return "User{" +
        "uId=" + uId +
        ", uName=" + uName +
        ", uSex=" + uSex +
        ", uAge=" + uAge +
        ", uRid=" + uRid +
        "}";
    }
}

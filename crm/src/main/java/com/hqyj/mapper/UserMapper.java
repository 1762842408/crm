package com.hqyj.mapper;

import com.hqyj.entity.User;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author LJ
 * @since 2020-08-09
 */
public interface UserMapper extends BaseMapper<User> {

	@Select("select * from user where u_name = #{userName} and u_password = #{userPassword}")
	public List<User> selectByNameAndPassword( @Param("userName")String userName, @Param("userPassword")String userPassword);
}

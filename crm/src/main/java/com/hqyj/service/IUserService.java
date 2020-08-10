package com.hqyj.service;

import com.hqyj.entity.User;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LJ
 * @since 2020-08-09
 */
public interface IUserService extends IService<User> {

	public List<User> selectByNameAndPassword(String userName,String userPassword);
}

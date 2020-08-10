package com.hqyj.service.impl;

import com.hqyj.entity.User;
import com.hqyj.mapper.UserMapper;
import com.hqyj.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LJ
 * @since 2020-08-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

	@Override
	public List<User> selectByNameAndPassword(String userName, String userPassword) {
		return baseMapper.selectByNameAndPassword(userName, userPassword);
	}

	

	
}

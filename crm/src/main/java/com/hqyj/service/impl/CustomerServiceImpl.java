package com.hqyj.service.impl;

import com.hqyj.entity.Customer;
import com.hqyj.mapper.CustomerMapper;
import com.hqyj.service.ICustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

}

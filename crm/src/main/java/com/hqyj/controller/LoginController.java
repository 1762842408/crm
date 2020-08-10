package com.hqyj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hqyj.entity.Customer;
import com.hqyj.entity.PageResult;
import com.hqyj.entity.User;
import com.hqyj.service.IUserService;


@Controller
@CrossOrigin
@ResponseBody
public class LoginController {

	@Autowired
	private IUserService iUserService;
	PageResult<Customer> pr = new PageResult<>();
	
	@RequestMapping("/login")
	public PageResult<Customer> login(HttpServletRequest req,HttpServletResponse resp) {
		String userName = req.getParameter("username");
		String userPassword = req.getParameter("password");
		System.out.println(userName);
		List<User> list = iUserService.selectByNameAndPassword(userName, userPassword);
		if(list.size() >0) {
			System.out.println(userName);
			pr.setCode(0);
			pr.setMsg("成功");
			return pr;
		}
		pr.setCode(1);
		pr.setMsg("账号或密码错误");
		return pr;
	}
}

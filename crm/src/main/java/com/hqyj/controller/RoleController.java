package com.hqyj.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hqyj.entity.PageResult;
import com.hqyj.entity.Role;
import com.hqyj.service.IRoleService;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author LJ
 * @since 2020-08-09
 */
@Controller
@RequestMapping("/role")
@ResponseBody
@CrossOrigin
public class RoleController {

	@Autowired
	private IRoleService iRoleService;
	PageResult<Role> pr = new PageResult<>();
	
	@RequestMapping("/getAllRole")
	public PageResult<Role> getAllRole(Integer page,Integer limit,Role role){
		 IPage<Role> pg = new Page<>(page,limit);
		 QueryWrapper<Role> queryWrapper = new QueryWrapper<>();
		 if(role.getrRole()!=null) {
				queryWrapper.like("r_role", role.getrRole());//第一个参数是字段名；第二个参数用like的时候不需要添加前后%
			}
		IPage<Role> iPage = iRoleService.page(pg,queryWrapper);
		 pr.setCode(0);
		 pr.setCount(iPage.getTotal());
		 pr.setData(iPage.getRecords());
		 pr.setMsg("查询成功");
		 return pr;
	}
	
	@RequestMapping("/addRole")
	public PageResult<Role> addRole(Role role){
		iRoleService.save(role);
		pr.setCode(0);
		pr.setMsg("新增成功");
		return pr;
	}
	
	@RequestMapping("/updateRole")
	public PageResult<Role> updateRole(Role role){
		iRoleService.updateById(role);
		pr.setCode(0);
		pr.setMsg("修改成功");
		return pr;
	}
	
	@RequestMapping("/deleteRole")
	public PageResult<Role> deleteRole(Integer[] ids) {
		iRoleService.removeByIds(Arrays.asList(ids));
		pr.setCode(0);
		pr.setMsg("删除成功");
		return pr;
	}
}


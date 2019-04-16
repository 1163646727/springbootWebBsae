package com.pri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.pri.entity.User;
import com.pri.service.UserService;

@RestController
public class IndexController {
	@Autowired
	private UserService userService;

	@RequestMapping("/findUserList")
	public PageInfo<User> findUserList(int page, int size) {
		System.out.println("整合mybatis--Controller");
		return userService.findUserList(page, size);
	}
	
	/**
	 * Method name: userList <BR>
	 * Description: 测试 <BR>
	 * Remark: <BR>
	 * @return  List<User><BR>
	 * @author )Mine+
	 */
	@RequestMapping("/userList")
	public List<User> userList(){
		return userService.userList();
	}

}

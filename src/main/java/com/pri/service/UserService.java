package com.pri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;
import com.pri.dao.UserMapper;
import com.pri.entity.User;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;


	/**
	 * Method name: findUserList <BR>
	 * Description: findUserList <BR>
	 * Remark: <BR>
	 * @param page
	 * @param size
	 * @return  PageInfo<User><BR>
	 * @author )Mine+
	 */
	public PageInfo<User> findUserList(int page, int size) {
		System.out.println("整合mybatis--Service");
		// 开启分页插件,放在查询语句上面
		PageMethod.startPage(page, size);
		List<User> listUser = userMapper.findUserList();
		// 封装分页之后的数据
		PageInfo<User> pageInfoUser = new PageInfo<User>(listUser);
		return pageInfoUser;
	}
	public List<User> userList(){
		return userMapper.userList();
	}

}

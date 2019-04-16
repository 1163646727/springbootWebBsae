package com.pri.dao;

import java.util.List;

import com.pri.entity.User;

public interface UserMapper {
	
	List<User> findUserList();

	List<User> userList();

}

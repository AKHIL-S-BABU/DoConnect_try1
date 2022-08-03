package com.quiz.model.Service;

import java.util.Set;

import com.quiz.model.User;
import com.quiz.model.UserRole;

public interface UserService {
	
	//create function for creating user
	public User createUser(User user,Set<UserRole> userRoles);// throws Exception;
	
	
	//get user by username
	public User getUser(String username);
	
	
	//delete user by id
	public void deleteUser(Long userId);
	
}

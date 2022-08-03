package com.quiz.model.Service.Impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.model.User;
import com.quiz.model.UserRole;
import com.quiz.model.Repo.RoleRepository;
import com.quiz.model.Repo.UserRepository;
import com.quiz.model.Service.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	@Autowired 
	private RoleRepository roleRepository;
	
	//creating user
	public User createUser(User user, Set<UserRole> userRoles){// throws Exception {
		// TODO Auto-generated method stub
		User local=this.userRepository.findByUsername(user.getUsername());
		if(local != null)
		{
			System.out.println("User is already there!!");
			//throw new Exception("User already present!!");
		}
		else {
			//user create
			for(UserRole ur:userRoles)
			{
				roleRepository.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			local= this.userRepository.save(user);
			}
		
		return local;
	}

	
	//getting user by username
	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return this.userRepository.findByUsername(username);
	}


	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		this.userRepository.deleteById(userId);
		
	}
	

	




	


	

}

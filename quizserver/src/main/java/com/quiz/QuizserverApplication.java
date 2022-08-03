package com.quiz;

//import javax.management.relation.Role;
import com.quiz.model.Role;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.quiz.model.User;
import com.quiz.model.UserRole;
import com.quiz.model.Repo.RoleRepository;
import com.quiz.model.Service.UserService;

@SpringBootApplication
public class QuizserverApplication implements CommandLineRunner{
	
	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(QuizserverApplication.class, args);
	
	
	}
	public void run(String... args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.out.println("Starting code");
//		
//		
//		User user=new User();
//		user.setFirstName("Akhil");
//		user.setLastName("Babu");
//		user.setUsername("Akhils15");
//		user.setPassword("abc");
//		user.setEmail("akhilsbabu@gmail.com");
//		user.setProfile("default.png");
//		
//		Role role1 = new Role();
//		role1.setRoleId(44L);
//		role1.setRoleName("ADMIN");
//		
//		Set<UserRole> userRoleset=new HashSet<>();
//		UserRole userRole=new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//	//userRole.setUserRoleId(33L);
//		
//		
//		userRoleset.add(userRole) ;
//		
//		User user1=	this.userSerive.createUser(user, userRoleset);
//		System.out.println(user1.getUsername());
//		
		
		
		
	}

}

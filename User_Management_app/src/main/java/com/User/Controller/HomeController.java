package com.User.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.User.model.UserDetails;
import com.User.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@GetMapping("/register")
	public String register()
	{
		return "register";
	}
	
	@PostMapping("/createUser")
	public String createuser(@ModelAttribute UserDetails user)
	{
		//System.out.println(user);
		
		UserDetails userDetails=userService.createUser(user);
		
		if(userDetails!=null)
		{
			System.out.println("Register Sucessfully");
		}
		else {
			System.out.println("Something error in server");
		}
		return "register";
	}
	
	

}

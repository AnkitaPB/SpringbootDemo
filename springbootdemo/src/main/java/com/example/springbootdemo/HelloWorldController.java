package com.example.springbootdemo;

import javax.ws.rs.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootdemo.bean.HelloWordBean;

@RestController
public class HelloWorldController {

	@Autowired
	UserDAOService service;
	
	@RequestMapping(method=RequestMethod.GET, path = "/hello")
	public String helloWorld() {
		return "Hello Ankita";
	}
	
	@GetMapping(path="/hello-word-bean")
	public HelloWordBean getHelloWordBean()
	{
		return new HelloWordBean("hi");
		
	}
	
	@GetMapping(path="/hello-word-bean/{name}")
	public HelloWordBean getHelloWordBeanUsingPathVar(@PathVariable String name)
	{
		return new HelloWordBean(name);
	}
	@PostMapping(path="/user")
	public void createMessage(@RequestBody User user)
	{
		User createdUser=service.save(user);
	}
}


package com.crudapp.projectcrud.hello;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("hello")
	//
	public String sayHello() {
		return "Hello! everyone, Iam TP uchiha";
	}
}

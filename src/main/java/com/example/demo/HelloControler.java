package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {


	protected static Logger log = LoggerFactory.getLogger(HelloControler.class);
	
	@RequestMapping("/")
	public String helloworld(){
		log.debug("============================hello");
		return "hello world";
	}
	@RequestMapping("/hello/{myName}")
	public String hellName(@PathVariable String myName){
		log.debug("hello"+myName);
		return "hello" + myName;
	}
}

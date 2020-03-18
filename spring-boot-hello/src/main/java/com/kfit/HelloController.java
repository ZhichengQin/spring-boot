package com.kfit;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello(){
		return "Hello world!";
	}
	
	@RequestMapping("/getDemo")
	public Demo getDemo1(){
		Demo demo = new Demo();
		demo.setId(0);
		demo.setName("dfhj经代");
		demo.setDate(new Date());
		return demo;
	}
	@RequestMapping("/getDemo1")
	public Demo getDemo2(){
		Demo demo = new Demo();
		demo.setId(0);
		demo.setName("dfj");
		demo.setDate(new Date());
		return demo;
	}
}

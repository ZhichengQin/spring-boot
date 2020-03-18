package com.kfit.template;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/templates")
public class TemplateController {
	@RequestMapping("/hello")
	public String action(Map<String,Object> map){
		map.put("hello","from TemplateController.helloHtml");

		return "hello";
	}
}

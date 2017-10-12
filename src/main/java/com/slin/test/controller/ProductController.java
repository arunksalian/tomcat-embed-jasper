package com.slin.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Controller
@EnableSwagger2
@RequestMapping("/product")
public class ProductController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String getHome () {
		return "hii";
	}
}

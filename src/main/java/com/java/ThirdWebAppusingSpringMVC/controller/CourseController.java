package com.java.ThirdWebAppusingSpringMVC.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {
	@GetMapping("/courseinfo")
	public String getCourse(Map<String,Object> map) {
		Course c = new Course(101,"Java",1000);
		map.put("course", c);
		return "course";
	}
	@GetMapping("/courseinfo1")
	public String getCourse1(Map<String,Object> map) {
		Course c = new Course();
		map.put("cid", "102");
		map.put("cname", "Java");
		map.put("cprice", "2000");
		return "course1";
	}
}

package com.riblabs.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.riblabs.springbootdemo.company.Company;

@Controller
public class HomeController {
	 
	
	@RequestMapping("/home")
	public Company home() {
		System.out.println("Welcome Home");
		Company c = new Company("riblabs", "kochi", "www.riblabs.com");
		return c;
		
	}

}

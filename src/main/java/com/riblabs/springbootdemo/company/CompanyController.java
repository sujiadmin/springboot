package com.riblabs.springbootdemo.company;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
	
	Logger logger = LoggerFactory.getLogger(CompanyController.class);
	
	@RequestMapping("/companies")
	public List<Company> home() {
		logger.info("Welcome Company");
		return Arrays.asList(new Company("riblabs", "kochi", "www.riblabs.com"));
		
	}
}

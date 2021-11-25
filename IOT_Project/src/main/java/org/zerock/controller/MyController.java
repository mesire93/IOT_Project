package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class MyController {

	
	@GetMapping("/index")
	public void logoutGET() {
		log.info("=== index.jsp ===");
	}
}

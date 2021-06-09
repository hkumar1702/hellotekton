package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

	@GetMapping("/hellotekton")
	public String testMessage() {
		LOGGER.info("hellotekton ::");
		return "My First Tekton POC-3";

	}

}
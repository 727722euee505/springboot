package com.example.day9;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController

public class LoggerController {
	
	Logger logger=(Logger) LoggerFactory.getLogger(Controller.class);
	
	@GetMapping("/test")
	public String hello()
	{
		logger.trace("A TRACE Message");
		logger.debug("A DEBUG Message");
		logger.info("A INFO Message");
		logger.warn("A WARN Message");
		logger.error("A ERROR Message");
		return"Hello Scaler!";
	}

}

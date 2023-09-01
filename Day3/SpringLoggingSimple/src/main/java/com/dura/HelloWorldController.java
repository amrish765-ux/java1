package com.dura;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
 
	Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
 @GetMapping(path="/")
 public String sayHello() {
  return "Hello!! from Duratech";
 }

 @GetMapping(path="/welcome")
 public String sayHello1() {
	 logger.info("This is hello world controller");
	 logger.error("This is error message");
	 logger.trace("Fatal error");
  return "Hello!! from Duratech and CGI for IIHT";
 }
 
}
package com.cafe24.springex.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc	// spring-servlet.xml 설정에 mvc : 붙은 애들은 한큐 쓸수 있다.
@ComponentScan({"com.cafe24.springex.controller"})
public class WebConfig {
	
}

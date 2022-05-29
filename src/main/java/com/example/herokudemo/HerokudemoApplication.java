package com.example.herokudemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class HerokudemoApplication {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "<h1> Hello World probando 2!!</h1> ";
	}

	public static void main(String[] args) {
		SpringApplication.run(HerokudemoApplication.class, args);
	}

}

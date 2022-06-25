package com.dfgjlt.pompom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class PompomApplication {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "We are POMPOM.";
	}


	public static void main(String[] args) {
		SpringApplication.run(PompomApplication.class, args);
	}

}

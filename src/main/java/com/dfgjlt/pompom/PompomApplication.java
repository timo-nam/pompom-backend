package com.dfgjlt.pompom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@SpringBootApplication
public class PompomApplication {

	private final UserRepository userRepository;

	public PompomApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "We are POMPOM.";
	}

	@RequestMapping("/users")
	@ResponseBody
	public List<User> users() {
		return userRepository.findAll();
	}


	public static void main(String[] args) {
		SpringApplication.run(PompomApplication.class, args);
	}

}

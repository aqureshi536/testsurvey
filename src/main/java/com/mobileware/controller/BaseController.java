package com.mobileware.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;

public class BaseController {

	@GetMapping("/check")
	public String check() {
		return new Date() + " Test software up and running";
	}
}

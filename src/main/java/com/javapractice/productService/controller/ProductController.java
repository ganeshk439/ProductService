package com.javapractice.productService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class ProductController {

	public String greeting() {
		return "hello ganesh";
	}
}

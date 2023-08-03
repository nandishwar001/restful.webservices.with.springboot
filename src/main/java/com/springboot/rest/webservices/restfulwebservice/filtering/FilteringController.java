package com.springboot.rest.webservices.restfulwebservice.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public Bean1 filtering() {
		return new Bean1("value1", "value2", "value3");
	}

	@GetMapping("/filtering-list")
	public List<Bean1> filteringList() {
		return Arrays.asList(new Bean1("value4", "value5", "value6"), new Bean1("value7", "value8", "value9"));
	}
}

package com.springboot.rest.webservices.restfulwebservice.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class DynamicFilteringController {

	@GetMapping("/dynamic-filtering")
	public MappingJacksonValue filtering() {
		Bean2 bean = new Bean2("value1", "value2", "value3");

		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(bean);

		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field3");

		FilterProvider filters = new SimpleFilterProvider().addFilter("BeanFilter", filter);

		mappingJacksonValue.setFilters(filters);

		return mappingJacksonValue;
	}

	@GetMapping("/dynamic-filtering-list")
	public MappingJacksonValue filteringList() {
		List<Bean2> list = Arrays.asList(new Bean2("value4", "value5", "value6"),
				new Bean2("value7", "value8", "value9"));

		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(list);

		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2", "field3");

		FilterProvider filters = new SimpleFilterProvider().addFilter("BeanFilter", filter);

		mappingJacksonValue.setFilters(filters);

		return mappingJacksonValue;
	}
}

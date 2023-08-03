package com.springboot.rest.webservices.restfulwebservice.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("BeanFilter")
public class Bean2 {

	private String field1;
	private String field2;
	private String field3;

	public Bean2(String field1, String field2, String field3) {
		super();
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String getField3() {
		return field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

	@Override
	public String toString() {
		return "Bean1 [field1=" + field1 + ", field2=" + field2 + ", field3=" + field3 + "]";
	}

}

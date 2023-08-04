package com.springboot.rest.webservices.restfulwebservice.security;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {

		// All requests should be authenticated
		httpSecurity.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());

		// If a request is not authenticated. For authentication, popup should be shown
		httpSecurity.httpBasic(withDefaults());

		// disable CSRF to execute POST, PUT requests
		httpSecurity.csrf().disable();

		return httpSecurity.build();

	}
}

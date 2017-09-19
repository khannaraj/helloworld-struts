package com.brijinc.struts.demo.model;

/**
 * Model class representing user information and user attributes.
 * 
 * @author Raj Khanna, BRIJ INc
 * @since 01-SEP-2017
 * @version 1.0
 *
 */
public class DemoUser {

	private String greeting = "Welcome to Struts 2 Hello World!";

	public DemoUser() {
	}

	public String showGreeting() {
		return greeting;
	}

}

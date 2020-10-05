package com.capgemini.day6problem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserRegistration {
	private static final Logger LOG = LogManager.getLogger(UserRegistration.class);

	public static void main(String[] args) {
		String message = "Welcome to User Registration Form!!!";
		LOG.info("{}",message);
	}
}
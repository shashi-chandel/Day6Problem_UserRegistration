package com.capgemini.day6problem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	private static final Logger LOG = LogManager.getLogger(UserRegistration.class);
	private static String namePattern = "[A-Z]{1}[a-zA-Z]{2,}";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LOG.info("Enter your First Name:");
		String first = sc.nextLine();
		if (Pattern.matches(namePattern, first))
			LOG.info("Valid first name");
		else
			LOG.info("Invalid entry!!");
	}
	
	public boolean validateFirstName(String first) {
		return first.matches(namePattern);
	}
}
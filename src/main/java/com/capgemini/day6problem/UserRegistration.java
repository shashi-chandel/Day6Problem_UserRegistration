package com.capgemini.day6problem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class UserRegistration {
	private static final Logger LOG = LogManager.getLogger(UserRegistration.class);
	private static String namePattern = "[A-Z]{1}[a-zA-Z]{2,}";
	private static String emailPattern = "^(abc)([-/./+_]?[a-z0-9]+)?[a-z0-9]*[@][a-z1-9]+[/.][a-z]{2,3}([/.]?[a-z]{2,3})?$";
	private static final String mobilePattern = "[0-9]{2}[' ']{1}[789]{1}[0-9]{9}";
	private static final String passwordPattern = "((?=.*[A-Z]){1,}).{8,}";
			
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserRegistration userRegistration = new UserRegistration();
		String first, last;
		LOG.info("Enter your first name: ");
		first = sc.nextLine();
		if (userRegistration.validateFirstName(first))
			LOG.info(" Valid first name!");
		else
			LOG.info(" Invalid first name!");

		LOG.info("\nEnter your last name: ");
		last = sc.nextLine();

		if (userRegistration.validateFirstName(last))
			LOG.info(" Valid last name!");
		else
			LOG.info(" Invalid last name!");

		LOG.info("Enter your email id: ");
		String email = sc.nextLine();
		if (userRegistration.validateEmail(email))
			LOG.info(" Valid email id!");
		else
			LOG.info(" Invalid email id!");
		
		LOG.info("Enter your mobile number with country code: ");
		String mobileNumber = sc.nextLine();
		if (userRegistration.validateMobileNumber(mobileNumber))
			LOG.info(" Valid mobile number!");
		else
			LOG.info(" Invalid mobile number!");
		
		LOG.info("Enter your password having minimum 8 characters with atleast 1 Upper case: ");
		String password = sc.nextLine();
		if (userRegistration.validatePassword(password))
			LOG.info(" Valid password!");
		else
			LOG.info(" Invalid password!");
		sc.close();
	}

	public boolean validateFirstName(String first) {
		return first.matches(namePattern);
	}

	public boolean validateLastName(String last) {
		return last.matches(namePattern);
	}

	public boolean validateEmail(String email) {
		return email.matches(emailPattern);
	}
	
	public boolean validateMobileNumber(String mobile) {
		return mobile.matches(mobilePattern);
	}
	
	public boolean validatePassword(String password) {
		return password.matches(passwordPattern);
	}
}
package com.capgemini.day6problem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class UserRegistration {
	private static final Logger LOG = LogManager.getLogger(UserRegistration.class);
	private static String namePattern = "[A-Z]{1}[a-zA-Z]{2,}";

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
		sc.close();
	}

	public boolean validateFirstName(String first) {
		return first.matches(namePattern);
	}

	public boolean validateLastName(String last) {
		return last.matches(namePattern);
	}
}
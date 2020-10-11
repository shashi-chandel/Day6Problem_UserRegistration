package com.capgemini.day6problem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserRegistration {
	ValidatePatternInterface validatePattern = (userInput, regexPattern) -> {
		return (userInput.matches(regexPattern) ? true : false);
	};

	private static final Logger LOG = LogManager.getLogger(UserRegistration.class);
	private static final String NAME_PATTERN = "^[A-Z]{1}[a-zA-Z]{2,}";
	private static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+[_+-.]{0,1}[a-zA-Z0-9]+@[a-zA-Z0-9]+[.]{1}[a-zA-Z]{2,4}([.]{0,1}[a-z]{2,4}){0,1}$";
	private static final String MOBILE_PATTERN = "[1-9]{2}[' ']{1}[789]{1}[0-9]{9}";
	private static final String PASSWORD_PATTERN = "^(?=.{8,}$)(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]*[@#$%^*!&][0-9a-zA-Z]*";

	public static void main(String[] args) {
		LOG.info("Welcome to Vaidation and Testing");
	}

	public boolean validateFirst(String first) throws UserRegistrationException {
		if (validatePattern.validate(first, NAME_PATTERN))
			return true;
		else
			throw new UserRegistrationException("Invalid First Name! Please, Enter proper name");
	}

	public boolean validateLast(String last) throws UserRegistrationException {
		if (validatePattern.validate(last, NAME_PATTERN))
			return true;
		else
			throw new UserRegistrationException("Invalid Last Name! Please, Enter proper name");
	}

	public boolean validateEmail(String email) throws UserRegistrationException {
		if (validatePattern.validate(email, EMAIL_PATTERN))
			return true;
		else
			throw new UserRegistrationException("Invalid Email Id! Please, Enter proper email");
	}

	public boolean validateMobileNumber(String mobile) throws UserRegistrationException {
		if (validatePattern.validate(mobile, MOBILE_PATTERN))
			return true;
		else
			throw new UserRegistrationException("Invalid Mobile Number! Please, Enter proper mobile number");
	}

	public boolean validatePassword(String password) throws UserRegistrationException {
		if (validatePattern.validate(password, PASSWORD_PATTERN))
			return true;
		else
			throw new UserRegistrationException("Invalid First Password! Please, Enter proper password");
	}

}
package com.capgemini.day6problem;

public class UserRegistration {

	private static final String namePattern = "^[A-Z]{1}[a-zA-Z]{2,}";
	private static final String emailPattern = "^[0-9a-zA-Z]+[_+-.]{0,1}[a-zA-Z0-9]+@[a-zA-Z0-9]+[.]{1}[a-zA-Z]{2,4}([.]{0,1}[a-z]{2,4}){0,1}$";
	private static final String mobilePattern = "[1-9]{2}[' ']{1}[789]{1}[0-9]{9}";
	private static final String passwordPattern = "^(?=.{8,}$)(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]*[@#$%^*!&][0-9a-zA-Z]*";

	public boolean validateFirst(String first) {
		return first.matches(namePattern);
	}

	public boolean validateLast(String last) {
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
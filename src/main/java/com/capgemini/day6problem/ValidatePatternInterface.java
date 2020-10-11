package com.capgemini.day6problem;

@FunctionalInterface
public interface ValidatePatternInterface {
	public boolean validate(String userInput, String regexPattern);
}

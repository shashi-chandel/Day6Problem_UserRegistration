package com.capgemini.day6problem;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void whenGiven_ProperFirstName_ShouldReturn_True() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			boolean result = userRegistration.validateFirst("Shashi");
			Assert.assertTrue(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void whenGiven_ShortFirstName_ShouldReturn_False() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			boolean result = userRegistration.validateFirst("Sh");
			Assert.assertFalse(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void whenGiven_NotLetterFirst_ShouldReturn_False() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			boolean result = userRegistration.validateFirst("Shashi*");
			Assert.assertFalse(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void whenGiven_NotCapitalFirst_ShouldReturn_False() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			boolean result = userRegistration.validateFirst("shashi");
			Assert.assertFalse(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void whenGiven_ProperLastName_ShouldReturn_True() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			boolean result = userRegistration.validateLast("Bhushan");
			Assert.assertTrue(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void whenGiven_ShortName_ShouldReturn_False() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			boolean result = userRegistration.validateLast("Bh");
			Assert.assertFalse(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void whenGiven_NotLetterLast_ShouldReturn_False() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			boolean result = userRegistration.validateLast("bhushan55");
			Assert.assertFalse(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void whenGiven_NotCapitalLast_ShouldReturn_False() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			boolean result = userRegistration.validateLast("chadnel");
			Assert.assertFalse(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void whenGiven_ProperEmail_ShouldReturn_True() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			boolean result = userRegistration.validateEmail("abc.100@bl.co.in");
			Assert.assertTrue(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void whenGiven_ImProperEmail_ShouldReturn_False() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			boolean result = userRegistration.validateEmail("abc.@gmail.com");
			Assert.assertFalse(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void whenGiven_ProperMobile_ShouldReturn_True() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			boolean result = userRegistration.validateMobileNumber("91 9875858585");
			Assert.assertTrue(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void whenGiven_LessDigits_ShouldReturn_False() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			boolean result = userRegistration.validateMobileNumber("91 89874");
			Assert.assertFalse(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void whenGiven_ImproperCountryCode_ShouldReturn_False() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			boolean result = userRegistration.validateMobileNumber("00 8987489898");
			Assert.assertFalse(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void whenGiven_WithoutCountryCode_ShouldReturn_False() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			boolean result = userRegistration.validateMobileNumber("8987489898");
			Assert.assertFalse(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void whenGiven_MoreThanTenDigits_ShouldReturn_False() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			boolean result = userRegistration.validateMobileNumber("91 89898989889");
			Assert.assertFalse(result);
		} catch (UserRegistrationException e) {

		}
	}

	@Test
	public void whenGiven_ProperPassword_ShouldReturn_True() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			boolean result = userRegistration.validatePassword("Rahul9@2");
			Assert.assertTrue(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void whenGiven_LessThanEightDigits_ShouldReturn_False() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			boolean result = userRegistration.validatePassword("kumr56!@");
			Assert.assertFalse(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void whenGiven_WithoutCapitalLetter_ShouldReturn_False() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			boolean result = userRegistration.validatePassword("rahul8548_");
			Assert.assertFalse(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void whenGiven_WithoutNumber_ShouldReturn_False() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			boolean result = userRegistration.validatePassword("Kumar!!6");
			Assert.assertFalse(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void whenGiven_WithoutSpecialCharater_ShouldReturn_False() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			boolean result = userRegistration.validatePassword("Shaty80");
			Assert.assertFalse(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void whenGiven_MoreThanOneSpecialCharater_ShouldReturn_False() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			boolean result = userRegistration.validatePassword("@@shSi20");
			Assert.assertFalse(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void whenGiven_NoDigit_ShouldReturn_False() {
		try {
			UserRegistration userRegistration = new UserRegistration();
			boolean result = userRegistration.validatePassword("@@shSihh");
			Assert.assertFalse(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}
}
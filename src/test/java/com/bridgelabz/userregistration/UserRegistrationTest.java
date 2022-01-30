package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.firstName("Sachin");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
		boolean result = userRegistration.firstName("sachin");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.lastName("Kumar");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.lastName("kumar");
		Assert.assertEquals(false, result);

	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.email("sachin2022@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.email("sachin&kumar@gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.phoneNumber("91 9604328902");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPhoneNumber_WhenNotProper_ShouldReturnFlase() {
		boolean result = userRegistration.phoneNumber("919604328902");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPasswordRule1_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.passwordRule1("sachin@325");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPasswordRule1_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.passwordRule1("sac@22");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.passwordRule2("Sachin@325");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.passwordRule2("sac@");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPasswordRule3_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.passwordRule3("123Aa@325");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPasswordRule3_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.passwordRule3("123456789");
		Assert.assertEquals(false, result);

	}

	@Test
	public void givenPasswordRule4_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.passwordRule4("sachin@325");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPasswordRule4_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.passwordRule4("sac22");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail1_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail1_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.emailIdValidator("abc()*@gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail2_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail3_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.emailIdValidator("abc()*@gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail4_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.emailIdValidator("abc123@gmail.a –");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail5_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.emailIdValidator("abc123@.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail6_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.emailIdValidator(".abc@abc.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail7_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.emailIdValidator("abc.@gmail.com –");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail8_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.emailIdValidator("abc@abc@gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail9_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.emailIdValidator("abc..2002@gmail.com");
		Assert.assertEquals(false, result);
	}
}

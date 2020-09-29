/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package User.Validator.JUnit.Test;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Assert;

public class UserRegistrationJUnitTest {
	@Test
	public void TestValidateFirstName() {
		UserRegistrationJUnit firstNameValidator = new UserRegistrationJUnit();
		boolean found = firstNameValidator.FirstNameValidation("Soumik");
		Assert.assertTrue(found);
	}
	
	@Test
	public void TestValidateLastName() {
		UserRegistrationJUnit lastNameValidator = new UserRegistrationJUnit();
		boolean found = lastNameValidator.LastNameValidation("Pal");
		Assert.assertTrue(found);
	}
	
	@Test
    public void TestValidateMobilNumber() {
    	UserRegistrationJUnit mobileNumberValidator = new UserRegistrationJUnit();
    	boolean found = mobileNumberValidator.MobileNumberValidation("91 9999999999");
    	Assert.assertTrue(found);
    }
	
	@Test
    public void TestValidateEmail() {
    	UserRegistrationJUnit emailValidator = new UserRegistrationJUnit();
    	boolean found = emailValidator.ValidateEmail("soumik.pal@gmail.co.in");
    	Assert.assertTrue(found);
    }
	
	@Test
    public void TestValidatePasswordRule1() {
    	UserRegistrationJUnit passwordValidator = new UserRegistrationJUnit();
    	boolean found = passwordValidator.PasswordRule1Validation("Resurrection9");
    	Assert.assertTrue(found);
    }
	
	@Test
    public void TestValidatePasswordRule2() {
    	UserRegistrationJUnit passwordValidator = new UserRegistrationJUnit();
    	boolean found = passwordValidator.PasswordRule2Validation("Resurrection9");
    	Assert.assertTrue(found);
    }
	
	@Test
    public void TestValidatePasswordRule3() {
    	UserRegistrationJUnit passwordValidator = new UserRegistrationJUnit();
    	boolean found = passwordValidator.PasswordRule3Validation("Resurrection9");
    	Assert.assertTrue(found);
    }
	
	@Test
    public void TestValidatePasswordRule4() {
    	UserRegistrationJUnit passwordValidator = new UserRegistrationJUnit();
    	boolean found = passwordValidator.PasswordRule4Validation("Resurrection@9");
    	Assert.assertTrue(found);
    }
}

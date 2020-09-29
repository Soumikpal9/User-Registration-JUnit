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
    	boolean found = emailValidator.ValidateEmail("soumikpal@gmail.com");
    	Assert.assertTrue(found);
    }
}

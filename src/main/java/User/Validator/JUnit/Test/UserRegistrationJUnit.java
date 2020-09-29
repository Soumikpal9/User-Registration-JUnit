/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package User.Validator.JUnit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationJUnit {
	public boolean FirstNameValidation(String input) {
		String regex = "^[A-Z]+[a-z A-Z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		boolean found = matcher.find();
		if(found) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean LastNameValidation(String input) {
		String regex = "^[A-Z]+[a-z A-Z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		boolean found = matcher.find();
		if(found) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean MobileNumberValidation(String input) {
		String regex = "^[0-9]{2}\s[0-9]{10}$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(input);
		boolean found = matcher.find();
		if(found) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean ValidateEmail(String input) {
		String regex = "^[A-Z 0-9]+[A-Z 0-9 +._-]*@[A-Z 0-9]+.[A-Z]+[A-Z .]*$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(input);
		boolean found = matcher.find();
		if(found) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean PasswordRule1Validation(String input) {
		String regex = "[A-Z a-z 0-9]{8,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		boolean found = matcher.find();
		if(found) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean PasswordRule2Validation(String input) {
		String regex = "^[A-Z a-z]*(?=.*[A-Z])[A-Z a-z 0-9]*${8,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		boolean found = matcher.find();
		if(found) {
			return true;
		}
		else {
			return false;
		}
	}
}

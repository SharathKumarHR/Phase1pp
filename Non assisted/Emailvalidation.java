package Nonass;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Emailvalidation {

	public static void main(String[] args) {
		
   String email1  = "java@emaileditz.com";
   String email2  = "javaemaileditz.com";
   
   
   System.out.println("email1="+validateEmail(email1));
   System.out.println("email2="+validateEmail(email1));
   
   
	}
public static String validateEmail(String email) {
	if(email==null || email.isEmpty()) {
		return "invaild";
	}
	String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	Pattern pattern = Pattern.compile(email);
	if (pattern.matcher(email).matches()) {
		return "valid";
	}
	else {
		return "invalid";
	
	}}
}

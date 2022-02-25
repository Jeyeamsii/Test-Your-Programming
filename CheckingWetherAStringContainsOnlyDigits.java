package TestYourJavaProgramming;

public class CheckingWetherAStringContainsOnlyDigits {
	public static void main(String[] args){
		String str = "05312003";
//To check if String contains only digits in Java, call matches() method on the string object and pass the regular expression "[0-9]+" that matches only if the characters in the given string are digits.
		boolean result = str.matches("[0-9]+");
		System.out.println("Original String : " + str);
//String.matches() with argument as "[0-9]+" returns a boolean value of true if the String contains only digits, else it returns false.
		System.out.println("Does string contain only Digits? : " + result);
	}
}
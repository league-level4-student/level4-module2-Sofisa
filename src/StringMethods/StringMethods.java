package StringMethods;

import java.util.Arrays;
import java.util.Base64;

/*
Visit the JavaDocs for the String class to view everything you can do with a String.  


HINT:  Here are some String methods you might find useful 
contains
replace
trim
length
getBytes
endsWith
split 
indexOf
lastIndexOf
compareTo(IgnoreCase)
substring


Here are some Character methods you might find useful:
Character.toLowerCase(char c);
Character.isLetter(char c);
Character.isDigit(char c);
Character.getNumericValue(char c);
 */

public class StringMethods {

	// Given Strings s1 and s2, return the longer String
	public static String longerString(String s1, String s2) {
		int compare = s1.compareTo(s2);
		if (s1.length() > s2.length()) {
			return s1;
		}else {
			return s2;
		}
	
	}

	
	// if String s contains the word "underscores", change all of the spaces to underscores
	public static String formatSpaces(String s) {
		if (s.contains("underscores")) {
			s = s.replace(" ", "_");
		}
		return s;
	}

	
	// Return the name of the person whose LAST name would appear first if they were in alphabetical order
	// You cannot assume there are no extra spaces around the name, but you can
	// assume there is only one space between the first and last name
	public static String lineLeader(String s1, String s2, String s3) {
		
		
	
		
		String s1trim = s1.trim();
		System.out.println(s1trim);
		String s2trim  = s2.trim();
		System.out.println(s2trim);
		String s3trim = s3.trim();
		System.out.println(s3trim);
	
		
		String[] array1 = s1trim.split(" ");
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		
		String[] array2 = s2trim.split(" ");
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		String[] array3 = s3trim.split(" ");
		System.out.println(array3[0]);
		System.out.println(array3[1]);
		
		if (array1[1].compareTo(array2[1]) <= 0) {
			//return array1[0];
			return s1trim;
		}else if (array2[1].compareTo(array3[1]) <=0) {
			//return array2[0];
			return s2trim;
		}else if (array2[1].compareTo(array3[1]) >=0) {
			//return array3[0];
			return s3trim;
		}else if (array1[1].compareTo(array2[1]) >= 0) {
			return s2trim;
			//return array2[0];
		}else if (array1[1].compareTo(array3[1]) >= 0) {
			//return array3[0];
			return s3trim;
		}else if (array1[1].compareTo(array3[1])<= 0) {
			//return array1[1];
			return s1trim;
		}
		
		return null;
	}
	
	
	// Return the sum of all numerical digits in the String
	public static int numeralSum(String s) {
		String nums = s.replaceAll("[a-zA-Z]", "");
		int sum = 0;
		System.out.println(nums);
		
		//String[] array = nums.split(" ");
		for (int i = 0; i < nums.length(); i++) {
			sum += nums.charAt(i) - '0';
			
		}
		//Character.isDigit();
		return sum;
	}
	
	
	// Return the number of times String substring appears in String s
	public static int substringCount(String s, String substring) {
		int contains = 0;
		if (s.contains(substring) == true) {
			contains++;
		}
		return contains;
	}


	// Call Utitilities.encrypt to encrypt String s
	public static String encrypt(String s, char key) {
		//Utilities.encrypt(s.getBytes(), key);
		return null;
	}

	// Call Utilities.decrypt to decrypt the cyphertext
	public static String decrypt(String s, char key) {
		return null;
	}


	// Return the number of words in String s that end with String substring
	// You can assume there are no punctuation marks between words
	public static int wordsEndsWithSubstring(String s, String substring) {
		return 0;
	}
	

	// Given String s, return the number of characters between the first occurrence
	// of String substring and the final occurrence
	// You can assume that substring will appear at least twice
	public static int distance(String s, String substring) {
		return 0;
	}


	// Return true if String s is a palindrome
	// palindromes are words or phrases are read the same forward as backward.
	// HINT: ignore/remove all punctuation and spaces in the String
	public static boolean palindrome(String s) {
		return true;
	}
	
}

class Utilities {
	// This basic encryption scheme is called single-byte xor. It takes a single
	// byte and uses exclusive-or on every character in the String.
	public static String encrypt(byte[] plaintext, byte key) {
		for (int i = 0; i < plaintext.length; i++) {
			plaintext[i] = (byte) (plaintext[i] ^ key);
		}
		return Base64.getEncoder().encodeToString(plaintext);
	}

	public static String decrypt(String cyphertext, byte key) {
		byte[] b = Base64.getDecoder().decode(cyphertext);
		for (int i = 0; i < b.length; i++) {
			b[i] = (byte) (b[i] ^ key);
		}
		return new String(b);
	}
}

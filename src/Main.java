import java.util.HashMap;
import java.util.Map;


public class Main {
	public static void main(String args[]) {
		System.out.println(recursivePalindrome("RACECARS"));
		System.out.println(reverseWord("Hello"));
		System.out.println(reversePhrase("The quick brown fox jumped over the brown dog."));
//		 integers = {3,2,1,3,5,6,7};
		
		
//		System.out.println(getDuplicates(integers));
		System.out.println(removeCharacter("Hello", 'l'));
		
		System.out.println(printPermutation("abc"));
		int[]integers = {0,1,2,3,5,6,7};
		System.out.println(getMissingNumber(integers));
	}
	
	
	/**
	 * Write code to check a String if palindrome or not?
	 * @param s
	 * @return
	 */
	public static Boolean isPalindrome(String s) {
		char[] word = s.toUpperCase().toCharArray();
		
		for(int i=0, j=word.length-1; i < j; i++, j--) {
			if(word[i] != word[j]) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Write a method which will remove any given character from a String
	 * @param intArray
	 * @return
	 */
	public static String removeCharacter(String s, char r) {
		char[] word = s.toCharArray();
		String retString = "";
		for(int i =0; i < word.length; i++) {
			if(word[i] != r) retString += word[i];
		}
		return retString;
	}
	
	/**
	 * Print all permutation of String both iterative and Recursive way *** INCOMPLETE
	 * @param s
	 * @return
	 */
	public static String printPermutation(String s) {
		char[] word = s.toCharArray();
		
		
		for (int i = 0; i < word.length; i++) {
			String retString = "";
			retString += word[i];
			for(int j = i; j < word.length; j++) {
				retString += word[j];
			}
			
			System.out.println(retString);
			
		}
		
		return new String("Hello");
		
	}
	
	/**
	 * Write a function to find out longest palindrome in a given string
	 * @param intArray
	 * @return
	 */
	
	/**
	 * In an array of 1-100 numbers are stored, one number is missing how do you find it?
	 * @param intArray
	 * @return
	 */
	public static Integer getMissingNumber(int[] intArray) {
		Map<Integer, Boolean> map = new HashMap<Integer,Boolean>();
		Integer returnInt = -1;
		for(int i = 0; i < intArray.length; i++) {
			map.put(i, false);
		}
		
		for(Integer i:intArray) {
			map.put(i, true);
		}
		
		for(Map.Entry<Integer, Boolean> entry: map.entrySet()) {
			if(!entry.getValue()) {
				returnInt = entry.getKey();
			}
		}
		return returnInt;
		
	}
	
	public static Map<Integer, Integer> getDuplicates(int[] intArray) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(Integer i:intArray) {
			if(map.get(i) == null) {
				map.put(i, 1);
			} else {
				map.put(i, new Integer(map.get(i).intValue() + 1));
			}
		}
		
		return map;
		
	}
	
	public static Boolean recursivePalindrome(String s) {
		if(s.length() > 1) {
			if(s.charAt(0) == s.charAt(s.length()-1)) {
				return recursivePalindrome(s.substring(1, s.length()-1));
			}
			return false;
		} else {
			return true;
		}
	}
	
	public static String reverseWord(String s) {
		char[] word = s.toCharArray();
		for(int i=0, j=word.length-1; i <j; i++, j--) {
			char placeholder = word[i];
			word[i] = word[j];
			word[j] = placeholder;
		}
		return String.valueOf(word);
	}
	
	public static String reversePhrase(String s) {
		String[] words = s.split(" ");
		String retString = "";
		for(int j=words.length-1; j >= 0; j--) {
			retString += words[j] + " ";
		}
		return retString;
	}
}

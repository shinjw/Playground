import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Main {
	public static void main(String args[]) {
		printMultiplicationTable();
	}
	
	
	/**
	 * 1. Write code to check a String if palindrome or not?
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
	 * 2. Write a method which will remove any given character from a String
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
	 * 3. Print all permutation of String both iterative and Recursive way *** INCOMPLETE
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
	 * 4. Write a function to find out longest palindrome in a given string
	 * @param intArray
	 * @return
	 */
	
	/**
	 * 5. In an array of 1-100 numbers are stored, one number is missing how do you find it?
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
	
	/**
	 * 6. In an array 1-100 exactly one number is a duplicate how do you find it?
	 * @param intArray
	 * @return
	 */
	public static Integer getOneDuplicate(int[] intArray) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Integer returnInt = -1;
		for (Integer num : intArray) {
			if(map.get(num) != null) {
				returnInt = num;
			} else {
				map.put(num, 1);
			}
		}
		return returnInt;
	}
	/**
	 * 7. In an array 1-100 many numbers are duplicates, how do you find it?
	 * @param intArray
	 * @return
	 */
	public static Map<Integer, Integer> getDuplicates(int[] intArray) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(Integer i:intArray) {
			if(map.get(i) == null) {
				map.put(i, 1);
			} else {
				map.put(i, new Integer(map.get(i).intValue() + 1));
			}
		}
		for(Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
		
		return map;
		
	}
	
	/**
	 * 8. Given two arrays, 1,2,3,4,5, and 2,3,1,0,5 find which number is not present in the second array
	 * @param s
	 * @return
	 */
	
	public static Map<Integer, Boolean> getNotExist(int[] intArray1, int[] intArray2) {
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for(Integer i: intArray1) {
			map.put(i, false);
		}
		for(Integer i: intArray2) {
			map.put(i, true);
		}
		
		for(Entry<Integer, Boolean> entry: map.entrySet()) {
			if(!entry.getValue()){
				System.out.println(entry.getKey());
			}
		}
		return map;
	}
	
	/**
	 * How do you find second highest number in an integer array
	 * @param s
	 * @return
	 */

	public static void printMultiplicationTable() {
		int[] array1 = new int[13];
		
		System.out.println("First Line");
		
		for(int i = 0; i <= 12; i++) {
			System.out.print(i + "  ");
			for(int j = 1; j <=12; j++) {
				if (i != 0) {
					System.out.print(i * j + "  ");
				} else {
					System.out.print(j + " ");
				}
				
			}
			System.out.println("");
		}
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

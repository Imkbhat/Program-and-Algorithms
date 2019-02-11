package com.string;

import java.util.Arrays;

public class AnagramCheck {
	
	public boolean anagramCheck(String str1, String str2) {
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 =  str2.toCharArray();
		
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		if(len1 != len2)
			return false;
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		
		for (int i=0;i<len1;i++) {
			if(arr1[i] != arr2[i] ) {
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		AnagramCheck check = new AnagramCheck();
		String s1 = "Kiarn";
		String s2 = "raniK";
		if(check.anagramCheck(s1, s2))
			System.out.println("Both String are anagram");
		else 
			System.out.println("Both String are not anagram");
	}

}

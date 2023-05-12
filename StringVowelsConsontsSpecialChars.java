package com.strings;

public class StringVowelsConsontsSpecialChars {

	public static void main(String[] args) {

		int count = 0;
		int vCount = 0, cCount = 0;
		String str = "He said!, Who are u ? and shouted: 'Iam going back to my home-town.' I heard it with my own ears;";
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			// Check whether char is a vowel
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vCount++;
			}
			// Checks whether char is a consonant
			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				cCount++;
			}
		}
		System.out.println("Number of vowels: " + vCount);
		System.out.println("Number of consonants: " + cCount);

		for (int i = 0; i < str.length(); i++) {
			// Checks whether given character is punctuation mark
			if (str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.'
					|| str.charAt(i) == '?' || str.charAt(i) == '-' || str.charAt(i) == '\'' || str.charAt(i) == '\"'
					|| str.charAt(i) == ':') {
				count++;
			}
		}
		System.out.println("The number of Special chars exists in the string is: " + count);
	}
}

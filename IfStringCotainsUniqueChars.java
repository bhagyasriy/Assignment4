package com.strings;

public class IfStringCotainsUniqueChars {

	public boolean uniqueCharacters(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j))
					return false;
			}
		}
		// If no duplicate characters encountered,
		return true;
	}

	public static void main(String args[]) {
		IfStringCotainsUniqueChars obj = new IfStringCotainsUniqueChars();
		String input = "it is my Favourite Dish";

		if (obj.uniqueCharacters(input))
			System.out.println("The String " + input + " has all unique characters");
		else
			System.out.println("The String " + input + " has duplicate characters");
	}

}

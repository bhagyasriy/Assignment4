package com.strings;

/*The string is called a pangram if it contains all the alphabets from a to z or A to Z, ignoring the case sensitivity.
 * eg: Pack my box with five dozen liquor jugs, Fix problem quickly with galvanized jets, The quick brown fox jumps over the lazy dog, etc.
 * */
public class PangramDemo {

	public static void main(String[] args) {
		String string = "Abcd efghijklMNOp qrstuvwxyz 0123";
		string = string.toLowerCase();
		string = string.replace(" ", "");
		System.out.println(string);
		boolean allLetterPresent = true;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			// checks if the string does not contains all the letters
			if (!string.contains(String.valueOf(ch))) {
				allLetterPresent = false;
				break;
			}
		}
		// checks if all the letters are presented or not
		if (allLetterPresent)
			System.out.println("Pangram String");
		else
			System.out.println("Not a Pangram String");
	}
}

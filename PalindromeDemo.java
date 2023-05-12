package com.strings;

import java.util.Scanner;

public class PalindromeDemo {

	public static void main(String[] args) {

		String s2 = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String: ");
		String s1 = sc.next();
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		if (s1.equals(s2)) {
			System.out.println("Entered string is Palindrome..");
		} else {
			System.out.println("Entered string is not palindrome");
		}
		sc.close();
	}

}

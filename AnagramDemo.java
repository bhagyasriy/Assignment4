package com.strings;

import java.util.Arrays;

public class AnagramDemo {

	public static void main(String[] args) {

		String s1 = "a gentle Man";
		String s2 = "elegant Man";
		s1 = s1.replace(" ", "");
		s2 = s2.replace(" ", "");
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		char[] array1 = s1.toCharArray();
		char[] array2 = s2.toCharArray();
		// Sort the array1 in ascending order
		char temp = 0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[i] > array1[j]) {
					temp = array1[i];
					array1[i] = array1[j];
					array1[j] = temp;
				}
			}
		}
		System.out.println(array1);
		// Sort the array1 in ascending order
		for (int i = 0; i < array2.length; i++) {
			for (int j = i + 1; j < array2.length; j++) {
				if (array2[i] > array2[j]) {
					temp = array2[i];
					array2[i] = array2[j];
					array2[j] = temp;
				}
			}
		}
		System.out.println(array2);
		if (Arrays.equals(array1, array2)) {
			System.out.println("Strings are anagram ");
		} else {
			System.out.println("Strings are not anagram");
		}
	}
}

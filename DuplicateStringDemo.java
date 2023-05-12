package com.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateStringDemo {

	public static void main(String[] args) {
		String info = "abbbcccdefff111111235";
		// Converting string to character array
		char str[] = info.toCharArray();
		int index = 0;
		// Traversing character array
		for (int i = 0; i < info.length(); i++) {
			int j;
			for (j = 0; j < i; j++) {
				if (str[i] == str[j]) 
					break;
			}
			if (j == i) {
				str[index++] = str[i];
			}
		}
		  //Print string after removing duplicate characters 
		System.out.println(String.valueOf(Arrays.copyOf(str, index)));

		System.out.println("--------anotherway to implement=========");

		String string = "aduplicatestringisastring";
		char[] chars = string.toCharArray();
		Set<Character> charSet = new HashSet<Character>();
		for (char c : chars) {
			charSet.add(c);
		}
		Iterator<Character> itr = charSet.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
	}

}

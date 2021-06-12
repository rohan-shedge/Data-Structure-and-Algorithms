package algorithms.string;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRank_StrongPassword {

	static int minimumNumber(int n, String password) {
		boolean lowerCase = false;
		boolean upperCase = false;
		boolean number = false;
		boolean special = false;
		String special_characters = "!@#$%^&*()-+";
		int acceptablePasswordLength = 6;
		
		char[] password1 = password.toCharArray();
		for (char c : password1) {
			if (c >= 'a' && c <= 'z')
				lowerCase = true;
			else if (c >= 'A' && c <= 'Z')
				upperCase = true;
			else if (c >= '0' && c <= '9')
				number = true;
			else if (special_characters.indexOf(c) != -1)
				special = true;
		}
		
		int neededLength = (acceptablePasswordLength - n);
		int count = 0;
		count += lowerCase ? 0 : 1;
		count += upperCase ? 0 : 1;
		count += number ? 0 : 1;
		count += special ? 0 : 1;
		return (count > neededLength) ? count : neededLength;
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String password = in.next();
		int answer = minimumNumber(n, password);
		System.out.println(answer);
		in.close();
	}
}
package kazzuaki_project;

import java.util.Scanner;

public class number_of_vowels {
public static int vowels(String str) {
	int count = 0;
	for (int i=0;i<str.length();i++) {
		char c = str.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			count++;
		}
	}
	return count;
}
public static void main(String[] args) {
	Scanner nr = new Scanner(System.in);
	System.out.println("Enter a string");
	String str = nr.next();
	int num =  vowels(str);
	System.out.println("number of vowels in your string is "+num);
	}
}

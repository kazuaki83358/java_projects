package kazzuaki_project;

import java.util.ArrayList;
import java.util.Scanner;

public class list_of_string_in_reverse_order {
	public static String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
public static void main(String[] args) {
	Scanner nr = new Scanner(System.in);
	ArrayList<String> list = new ArrayList<>();
	System.out.println("enter a list of string,one per line enter e for exit ");
	while (nr.hasNext()) {
		String input = nr.next();
		if (input.equals("e")) {
			break;
		}
		list.add(input);
	}
	ArrayList<String> reverseList = new ArrayList<>();
	 for (String str : list) {
		reverseList.add(reverseString(str));
	}
	 System.out.println("reverse list of string is");
	 for (String str : reverseList) {
		System.out.println(str);
	}
}
}

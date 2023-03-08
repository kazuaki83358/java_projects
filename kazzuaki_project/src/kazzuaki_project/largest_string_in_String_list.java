package kazzuaki_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class largest_string_in_String_list {
	public static String solution(List<String> string) {
	   String longString="";
	   for (String str : string) {
		if(str.length()>longString.length()) {
			longString = str;
		}
	}
	   return longString;
	}
public static void main(String[] args) {
	ArrayList<String> arraylist = new ArrayList<>();
	Scanner nr = new Scanner(System.in);
	System.out.println("Enter your string in list and press enter after every string write 'e' prees enter for stop entering number");
	String stop = ""; 
	while (!stop.equals("e")) {
         if (nr.hasNext()) {
           stop = nr.next();
             if (!stop.equals("e")) {
                 arraylist.add(stop);
             }
         } else {
             nr.next();
         }
     }
	System.out.println("your string array "+arraylist);
	String solution = solution(arraylist);
	System.out.println("your longest string is "+solution);
	
}
}

package kazzuaki_project;
import java.util.Arrays;
import java.util.Scanner;

public class alphabate_in_ascending_order {
public static void main(String[] args) {
	Scanner nr = new Scanner(System.in);
	System.out.println("enter a string for ascending order");
	String str = nr.next();
	char[] arr = str.toCharArray();

	Arrays.sort(arr);
	System.out.println("your string after arranging in ascending albhabetic order :- "+new String(arr));
	
	}
}

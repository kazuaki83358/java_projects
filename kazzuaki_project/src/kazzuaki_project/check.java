package kazzuaki_project;

import java.util.Scanner;

public class check {
	public static boolean checker(Integer num) {
		if (num==null) {
			return true;
		}
		return false;
	}
		
		
public static void main(String[] args) {
	Scanner nr = new Scanner(System.in);
	System.out.println("enter your number");
	int num = nr.nextInt();
	boolean result =checker(num);
	System.out.println(result);
	}

}

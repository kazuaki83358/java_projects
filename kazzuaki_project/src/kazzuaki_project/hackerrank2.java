package kazzuaki_project;

import java.util.Scanner;

public class hackerrank2 {
public static void main(String[] args) {
	Scanner nr = new Scanner(System.in);
	int t = nr.nextInt();
	for (int i=0;i<t;i++) {
		try {
			long n = nr.nextLong();
			System.out.println(n+" can be fitted in:");
			if(n>=-128&&n<=127)System.out.println("* byte");
		    if(n>= -Math.pow(2, 15)&&n<=Math.pow(2, 15))System.out.println("* short");
		    if(n>= -Math.pow(2, 31)&&n<= Math.pow(2, 31))System.out.println("* int");
		    if(n>= -Math.pow(2, 63)&&n<=Math.pow(2, 63))System.out.println("* long");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(nr.next()+" can't be fitted anywhere.");
		}
		}
	}
}


package kazzuaki_project;

import java.util.Scanner;

public class hackerrank1 {
public static void main(String[] args) {
	Scanner nr = new Scanner(System.in);//number of squires
	System.out.println();
	int t = nr.nextInt();
	for (int i=0;i<t;i++) {
		int a = nr.nextInt();//first integer in series
		int b = nr.nextInt();//second integer in series 
		int n = nr.nextInt();//number of integer in series 
		int result = a;
		for (int j=0;j<n;j++) {
			result += (int)Math.pow(2, j)*b;
			System.out.print(result+" ");
		}
		System.out.println();
	}
}
}

package kazzuaki_project;

import java.util.Scanner;

public class adding_array {
public static void main(String[] args) {
	Scanner nr = new Scanner(System.in);
	System.out.println("how much number do want to enter in array");
	int num = nr.nextInt();
	int [] arr = new int[num];
	int sum = 0;
	System.out.println("enter your numbers");
	for (int i=0;i<num;i++) {
		arr[i]= nr.nextInt();
	}
	for (int array : arr) {
		sum = sum +array;
	}
     System.out.println("sum of your array is "+sum);
}
}

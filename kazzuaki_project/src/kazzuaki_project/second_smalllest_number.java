package kazzuaki_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class second_smalllest_number {
public static void main(String[] args) {
	Scanner nr = new Scanner(System.in);
	System.out.println("enter how much number do you want to enter");
	int size = nr.nextInt();
	List<Integer> list  = new ArrayList<>();
	System.out.println("enter numbers");
	for (int i=0;i<size;i++) {
	     int num = nr.nextInt();
	     list.add(num);
	     }
    Collections.sort(list);
    int temp = list.get(1);
    System.out.println("second smallest number in list is : "+temp);
}
}

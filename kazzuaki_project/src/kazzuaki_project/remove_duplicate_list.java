package kazzuaki_project;

//Write a function that takes a list of integers and returns a new list with all the duplicates removed.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class remove_duplicate_list {
public static void main(String[] args) {
	HashSet<Integer> hashset = new HashSet<>();
	ArrayList<Integer> arraylist = new ArrayList<>();
	Scanner nr = new Scanner(System.in);
	System.out.println("Enter your number in list and press enter after every integer write -1 prees enter for stop entering number");
	int number=0; 
	while (number != -1) {
         if (nr.hasNextInt()) {
             number = nr.nextInt();
             if (number != -1) {
                 arraylist.add(number);
             }
         } else {
             nr.next();
         }
     }
	System.out.println("your list"+arraylist);
	hashset.addAll(arraylist);
	System.out.println("your list after removing duplicates from list"+hashset);
}
}

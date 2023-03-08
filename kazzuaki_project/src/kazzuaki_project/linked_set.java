package kazzuaki_project;

import java.util.LinkedHashSet;
import java.util.Set;

public class linked_set {
public static void main(String[] args) {
	//as other it also not allow duplicate data to print 
	//this print the as we odeer the data.
	//but is slow as compare to hash set 
	Set<String> myset = new LinkedHashSet<>();
	myset.add("nishant");
	myset.add("nikhil");
	myset.add("adnan");
	myset.add("nandini");
	myset.add("nishant");
	myset.add("nikhil");
	myset.add("adnan");
	myset.add("nandini");
	myset.forEach(item -> System.out.println(item));
	System.out.println(" ");
	System.out.println("printing data using foreach loop");
	// printing data in vertical using foreach loop and lamda 
	myset.forEach(Item -> System.out.println(Item));
	
}
}

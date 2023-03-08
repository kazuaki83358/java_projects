package kazzuaki_project;

import java.util.Set;
import java.util.TreeSet;

public class Tree_set {
public static void main(String[] args) {
	//it is also not allow same data to print as like other set but it is different then hash set it's print
	//data in oder acording to alphabeticaly 
	Set<String> myset = new TreeSet<>();
	myset.add("nishant");
	myset.add("nikhil");
	myset.add("adnan");
	myset.add("nandini");
	myset.add("nishant");
	myset.add("nikhil");
	myset.add("adnan");
	myset.add("nandini");
	System.out.println(myset);
	// there printing data in vertical by using lemda 
	myset.forEach(item -> System.out.println(item));
}
}

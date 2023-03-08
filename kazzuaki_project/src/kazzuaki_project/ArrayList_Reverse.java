package kazzuaki_project;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Reverse {
public static void main(String[] args) {
	ArrayList<String> mylist = new ArrayList<>();
	mylist.add("cat");
	mylist.add("dog");
	mylist.add("fish");
	System.out.println("printing array");
	System.out.println(mylist);
	Collections.reverse(mylist);
	System.out.println("printing array in reverse");
	System.out.println(mylist);
}
}

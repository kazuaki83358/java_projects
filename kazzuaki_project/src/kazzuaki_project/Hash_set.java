package kazzuaki_project;

import java.util.HashSet;
import java.util.Set;

public class Hash_set {
public static void main(String[] args) {
	//hash set not print data oderly bit it is faster then other list or set.
Set<String>	myset = new HashSet<>();
//hashet is also not allow same expresion to print or not count in a code.
myset.add("nishant");
myset.add("nikhil");
myset.add("adnan");
myset.add("nandini");
myset.add("nishant");
myset.add("nikhil");
myset.add("adnan");
myset.add("nandini");
System.out.println(myset);
System.out.println("..............printing set in vertical order...........");
//-> lemda expresion
myset.forEach(item -> System.out.println(item));
}
}

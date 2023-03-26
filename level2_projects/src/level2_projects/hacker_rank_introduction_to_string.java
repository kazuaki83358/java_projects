package level2_projects;

import java.util.Scanner;

public class hacker_rank_introduction_to_string {
public static void main(String[] args) {
	Scanner nr = new Scanner(System.in);
	System.out.println("");
	String A = nr.next();
	String B = nr.next();
	int sum = A.length()+B.length();
	System.out.println(sum);
	if (A.compareTo(B)>0) {
		System.out.println("yes");
	}else {
		System.out.println("No");
	}
	String result = A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1);
	System.out.println(result);
}
}

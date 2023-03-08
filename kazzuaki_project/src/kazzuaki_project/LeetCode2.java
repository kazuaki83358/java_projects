package kazzuaki_project;


import java.util.Scanner;

public class LeetCode2 {
  public static boolean solution(int x) {
	String str = Integer.toString(x);
	String revstr = new StringBuffer(str).reverse().toString();
	return revstr.equals(str);
  
  }
	
  public static void main(String[] args) {
	Scanner nr = new Scanner(System.in);
	System.out.println("enter a number");
	int x = nr.nextInt();
	boolean ans = solution(x);
	System.out.println(ans);
}
}

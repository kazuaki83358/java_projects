package kazzuaki_project;

import java.util.Scanner;

public class hackerrank5 {
public static void main(String[] args) {
    Scanner nr = new Scanner(System.in);
    int n = nr.nextInt();
    String s = Integer.toString(n);
    if(n==Integer.parseInt(s)) {
    	System.out.println("Good job");
    }else {
    	System.out.println("Wrong answer");
    }
}
}

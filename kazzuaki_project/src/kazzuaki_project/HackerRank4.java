package kazzuaki_project;

import java.util.Scanner;

public class HackerRank4 {
	static int breadth,height;
	static boolean flag = false;
	static {
		Scanner nr = new Scanner(System.in);
		 breadth = nr.nextInt();
		 height = nr.nextInt();
		 if(breadth>0&&height>0) {
			 flag=true;
		 }else {
			 System.out.println("java.lang.Exception: Breadth and height must be positive" );
		 }
	}
public static void main(String[] args) {
     if(flag) {
    	 int area = breadth*height;
    	 System.out.println(area);
     }
	
}
}

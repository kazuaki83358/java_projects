package kazzuaki_project;

import java.util.*;
public class nyquestion1 {
	public static int solution(List<Integer> ans) {
		int sum=0;
		for (Integer sol : ans) {
			if (sol%2==0) {
				sum+=sol;
			}
		}
		return sum;
	}
public static void main(String[] args) {
	Scanner nr = new Scanner(System.in);
	System.out.println("enter how much number you want to enter");
	int size = nr .nextInt();
	List<Integer> ans = new ArrayList<>();
	System.out.println("");
	for (int i=0;i<=size;i++) {
		int num = nr.nextInt();
		ans.add(num);
	}
	int SumOfEvenNumber = solution(ans);
	System.out.println("the sum of all integer number is :- "+SumOfEvenNumber);
}
}

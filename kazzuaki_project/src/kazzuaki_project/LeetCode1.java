package kazzuaki_project;

import java.util.Arrays;

public class LeetCode1 {
	public static int[] TwoSums(int[]nums,int target) {
		for (int i=0;i<nums.length;i++) {
			for (int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {};
		}
public static void main(String[] args) {
	int [] nums={3,6,8,9};
	int target = 11;
	int [] result = TwoSums(nums, target);
	System.out.println(Arrays.toString(result));
}
}

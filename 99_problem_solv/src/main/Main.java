package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[10000];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		for (int i = 0; i < nums.length; i++) {
			for (int a = 0; a < 10; a++) {
				for (int b = 0; b < 10; b++) {
					for (int c = 0; c < 10; c++) {
						for (int d = 0; d < 10; d++) {
							if(nums[i] == a * 1001 + b * 101 + c * 11 + d * 2) {
								nums[i] = 0;
							}
						}
					}
				}
			}
		}
		for(int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				System.out.println(nums[i]);
			}
		}
		
	}
}

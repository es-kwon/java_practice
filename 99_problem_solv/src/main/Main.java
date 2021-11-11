package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int max = 0;
		int min = 0;
		int num =0;
		
		for(int i = 0; i < N; i++) {
			num = sc.nextInt();
			if(i == 0) {
				max = num;
				min = num;
			}
			if(num > max) {
				max = num;
			}
			if(num < min) {
				min = num;
			}
		}
		System.out.print(min + " ");
		System.out.println(max);
		

	}
}

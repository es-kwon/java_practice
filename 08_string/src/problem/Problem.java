package problem;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
//		// Q1.
//		System.out.print("문자열을 입력하시오 : ");
//		String str = sc.nextLine();
//		int count_capital = 0;
//		int count_small = 0;
//		int count_e = 0;
//		for(int i = 0; i < str.length(); i++) {
//			if((str.charAt(i) >= 'a')&&(str.charAt(i) <= 'z')) {
//				count_small++;
//			}
//			else if ((str.charAt(i) >= 'A')&&(str.charAt(i) <= 'Z')) {
//				count_capital++;
//			}
//			if(str.toLowerCase().charAt(i) == 'e') {
//				count_e++;
//			}
//		}
//		System.out.printf("소문자의 개수 : %d\n", count_small);
//		System.out.printf("대문자의 개수 : %d\n", count_capital);
//		System.out.printf("E(e)의 개수 : %d\n", count_e);
		
//		// Q2.
//		System.out.print("메세지를 입력하세요 : ");
//		String str = sc.nextLine();
//		System.out.println();
//		char[] str_print = new char[str.length()]; 
//		
//		for(int i = 0; i < str.length(); i++) {
//			if(i == 0) {
//				str_print[i] = str.toLowerCase().charAt(i);
//			}
//			else if (str.charAt(i - 1) == ' ') {
//				str_print[i] = str.toLowerCase().charAt(i);
//			}
//			else {
//				str_print[i] = str.toUpperCase().charAt(i);
//			}
//		}
//		System.out.println("=== 그룹 채팅방 ===");
//		for(int i = 0; i < str_print.length; i++) {
//			System.out.print(str_print[i]);
//		}
		
		// Q3.
//		String str = sc.nextLine();
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		String str_Substring = "";
//		
//		for(int i = x; i < y; i++) {
//			str_Substring += str.charAt(i);
//		}
//		
//		System.out.println(str_Substring);
		
		char a = '\uAC01';
		System.out.println(a);

		
	}

}

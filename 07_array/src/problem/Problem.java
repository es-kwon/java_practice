package problem;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
//		// Q1.
//		int[] a1 = {1, 2, 3};
//		int[] a2 = {4, 5, 6};
//		int[] add = new int[a1.length];
//		int[] sub = new int[a1.length];
//		
//		for(int i = 0; i < a1.length; i++) {
//			add[i] = a1[i] + a2[i];
//			}
//		for(int i = 0; i < a1.length; i++) {
//			sub[i] = a2[i] - a1[i];
//			}
//		for(int i = 0; i < add.length; i++) {
//			System.out.println(add[i]);
//			}
//		for(int i = 0; i < sub.length; i++) {
//			System.out.println(sub[i]);
//			}
		
//		// Q2.
//		char[] seats = new char[10];
//		int select = 0; // 유저 선택 좌석 변수
//
//		// seats 배열 모든 원소 'O'로 할당
//		for (int i = 0; i < seats.length; i++) {
//			seats[i] = 'O';
//		}
//		// 좌석 검사 프로그램
//		while (true) {
//			System.out.println("======== SEATS ========\n" + "1   2   3   4   5   6   7   8   9   10\n"
//					+ "======================");
//			for (int i = 0; i < seats.length; i++) {
//				System.out.printf("%c  ", seats[i]);
//			}
//			System.out.println();
//			int exitCount = 0; // 프로그램 종료 카운트 변수
//			// 프로그램 종료 카운트
//			for (int i = 0; i < seats.length; i++) {
//				if (seats[i] == 'X') {
//					exitCount++;
//				}
//			}
//				// 카운트 달성시 프로그램 종료
//				if (exitCount == 10) {
//					System.out.println();
//					System.out.println("모든 좌석이 꽉 찼습니다");
//					System.out.println("프로그램 종료");
//					break;
//				}
//			System.out.println("종료하고자 하면 -1을 입력하세요");
//			System.out.print("좌석을 선택하세요 : ");
//			select = sc.nextInt(); // 좌석 번호 입력
//			// -1 입력시 프로그램종료
//			if (select == -1) {
//				System.out.println("프로그램 종료");
//				return;
//			}
//			// 유효한 좌석번호 검사
//			else if (!((select >= 1) && (select <= 10))) {
//				System.out.println("유효한 좌석번호가 아닙니다");
//				System.out.println("1 ~ 10번 좌석을 입력해주세요");
//				System.out.println();
//				continue;
//			}
//
//			// 좌석 선택 시 'X'로 변경
//			if (seats[select - 1] == 'O') {
//				seats[select - 1] = 'X';
//				System.out.printf("%d번 좌석 예약되었습니다\n", select);
//				System.out.println();
//			}
//			// 이미 예약된 좌석 선택불가
//			else {
//				System.out.println("이미 예약된 좌석입니다");
//				System.out.println("다시 선택하세요");
//				System.out.println();
//				continue;
//
//			}
//		}
		
//		// Q3.
//		System.out.print("몇 명의 후보자가 있습니까? : ");
//		int app = sc.nextInt();
//		System.out.println();
//		int select = 0;
//		int[] count = new int[app];
//		
//		while(true) {
//			System.out.printf(
//					"** -1을 누르면 종료됩니다**\n"
//					+ "1 ~ %d 후보자가 있습니다\n", app
//					);
//			System.out.println();
//			System.out.print("몇 번 후보자를 선택하시겠습니까? : ");
//			select = sc.nextInt();
//			System.out.println();
//			if(select == -1) {
//				System.out.println("프로그램이 종료됩니다");
//				break;
//			}
//			else if(!((select >= 1) && (select <= app))) {
//				System.out.println("유효한 번호가 아닙니다");
//				System.out.printf("1 ~ %d 사이의 번호를 선택해주세요\n", app);
//				System.out.println();
//				continue;
//			}
//			else {
//				count[select - 1]++;
//			}
//			System.out.println(
//					"========= Voting Result ========="
//					);
//			for(int i = 0; i < app; i++) {
//				System.out.printf("                   %d                                 %d                   \n", i + 1, count[i]);
//			}
//			System.out.println(
//					"============================"
//					);
//			System.out.println();
//		}
		
		// Q4.
		String ox = sc.next().toUpperCase();
		char[] oxChar = new char[ox.length()];
//		chst[] oxChar = ox.toCharArray(); // String to Char Array!!

		int sum = 0;
		int scores_sum = 0;
		scores_sum = 0;
		sum = 0;
		int[] scores = new int[ox.length()];
		for (int j = 0; j < ox.length(); j++) {
			oxChar[j] = ox.charAt(j);
			if (oxChar[j] == 'O') {
				sum = sum + 1;
				scores[j] = sum;
			} else if (oxChar[j] == 'X') {
				sum = 0;
				scores[j] = sum;
			}
		}
		for (int k = 0; k < scores.length; k++) {
			scores_sum = scores_sum + scores[k];
		}
		System.out.printf("OX 문제 채점 : %s\n", ox.toUpperCase());
		System.out.printf("OX 문제 채점결과 : %d\n", scores_sum);
		
//		// Q5.
//		
//		int[] dice = new int[6];
//		System.out.print("주사위 게임 횟수를 입력하세요 : ");
//		int num = sc.nextInt();
//		System.out.println();
//		int dice_res = 0;
//		for(int i = 0; i < num; i++) {
//			dice_res = (int)(Math.random() * 6 + 1);
//			dice[dice_res - 1]++;
//		}
//		System.out.println("===== 주사위게임 결과 =====");
//		for(int i = 0; i < dice.length; i++) {
//			System.out.printf("            %d                   %d\n", i +1, dice[i]);
//		}
//		System.out.println("=====================");

//		// Q6.
//		
//		System.out.print("몇개의 수? : ");
//		int num = sc.nextInt();
//		int[] nums = new int[num];
//		for(int i = 0; i < num; i++) {
//			System.out.print("수를 입력하시오 : ");
//			nums[i] = sc.nextInt();
//		}
//		System.out.println();
//		int[] nums_copy = new int[num];
//		for(int i = 0; i < num; i++) {
//			nums_copy[i] = nums[i];
//		}
//		int min = 0;
//		int[] rank_index = new int[num];
//		for(int i = 0; i < num; i++) {
//			min = Integer.MAX_VALUE;
//			for(int j = 0; j < num; j++) {
//				if(nums_copy[j] < min) {
//					min = nums_copy[j];
//					rank_index[i] = j;
//				}
//			}
//			nums_copy[rank_index[i]] = Integer.MAX_VALUE;
//		}
//		int[] rank = new int[num];
//		for(int i = 0; i < num; i++) {
//			rank[rank_index[i]] = i; 
//		}
//		
//		System.out.println("========= 순서 매기기 =========");
//		for(int i = 0; i < num; i++) {
//			System.out.printf("num :     %d     =>   order :           %d\n", nums[i], rank[i] + 1);
//		}
//		System.out.println("==========================");
		

		// Q7. 정렬 sorting
		
		System.out.print(">> 몇 개의 원소가 있습니까? : ");
		int num = sc.nextInt();
		System.out.println();
		int[] nums = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.print(">> 원소값을 입력하시오 : ");
			nums[i] = sc.nextInt();
		}
		int temp = 0;
		for(int i = 0; i < num - 1; i++) {
			for(int j = 1; j < num - i; j++) {
				if(nums[j] < nums[j - 1]) {
					temp = nums[j - 1]; 
					nums[j - 1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println(">> 정렬 결과 : ");
		for (int i = 0; i < num; i++) {
			System.out.print(nums[i] + " ");
		}
		
		
	}

}

package nested_loop;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		/* 중첩 반복문 (이중 반복문, nested loop)
		 * : 반복문 안에 반복문이 들어가있는 구조
		 * */
		
		/*	while() {
		 * 		while() {
		 * 		}
		 * }
		 * 
		 * for() {
		 * 		for(){
		 * 		}
		 * }
		 * 
		 * ***
		 * ***
		 * ***
		 * 
		 * */
		
//		for(int i =0; i < 3; i++) {
//			System.out.println("***");
//		}
//		
//		for(int i =0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		// 외부 for문을 제어 : i (1 ~ 4)
		// 내부 for문을 제어 : j (2 ~ 3)
		// i와 j는 혼용해서 사용하지 않을 것!
		
		
//		int n = 9;
//		for(int i = 0; i < n; i++) {
//			System.out.print("*");
//			if ((i + 1) % Math.sqrt(n) == 0) {
//				System.out.println("");
//			}
//		}
		
//		String star = "";
//		for(int i = 0; i < 5; i++) {
//			star = star + "*";
//			System.out.println(star);
//		}
//		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i = 0; i < 5; i++) {
//			for(int k = 4; k > i; k--) {
//				System.out.print(" ");
//			}
//			for(int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		// Q2. 
//		// 총 5명의 5개의 과목 성적 (국, 수, 사, 과, 영)
//		// 출력)
//		// 1번째 학생의 성적 입력 : 50 40 90 80 85
//		// 1번째 학생의 평균은 69점 입니다.
//		// 2번째 학생의 성적 입력 : 50 40 90 80 85
//		// 3번째 학생의 성적 입력 : 50 40 90 80 85
//		

//		
//		int scoreSum = 0;
//		int score = 0;
//		for(int i = 1; i < 6; i ++) {
//			scoreSum = 0;
//			System.out.printf("%d번째 학생의 성적 입력 : ", i);
//			for(int j = 0; j < 5; j++) {
//				score = sc.nextInt();
//				scoreSum = scoreSum + score;
//			}
//			System.out.printf("%d번째 학생의 평균은 %.2f점 입니다.\n", i, scoreSum / 5.0);
//		}
		
//		// Q3. 문자열의 팰린드롬 (Palindrome, 회문)
//		// 어떤 문자열을 순차적으로 읽어도 역순으로 읽어도 동일한 문자열을 회문이라고 합니다.
//		// 예를 들어, mom은 순차적으로 읽어도 mom, 역순으로 읽어도 mom 입니다.
//		// 입력된 문자열이 팰린드롬인지 아닌지 판별하는 프로그램을 작성하시오.
//		
//		String str = "";
//		System.out.print("문자열 입력 : ");
//		str = sc.nextLine();
//		boolean isPalin = true;
//		for(int i = 0; i < str.length() / 2; i++) {
//			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
//				isPalin = false;
//				break;
//			} // 팰린드롬이라고 가정한 후에 하나라도 다른게 있으면 false!! (**중요**)
//		}
//		
//		System.out.println(isPalin);
		
		// Q3-1. 사용자에게 문자열 두 개를 입력받아 두 문자열이 같은지 확인하는 equals()
		// equals 대소문자 구분
		// equalsIgnoreCase() 대소문자 구분 x
		
		String userInput1 = "";
		System.out.print("첫번째 문자열 : ");
		userInput1 = sc.next().toLowerCase();
		String userInput2 = "";
		System.out.print("두번째 문자열 : ");
		userInput2 = sc.next().toLowerCase();
		boolean isEqual = true;
		if(userInput1.length() != userInput2.length()) {
			System.out.println("다릅니다");
			return;
		}
		for(int i = 0; i < userInput1.length(); i++) {
				if(userInput1.charAt(i) != userInput2.charAt(i)) {
					isEqual = false;
					break;
				}
		}
		System.out.println(isEqual ? "같습니다." : "다릅니다");
		
		
		// Q4. 피타고라스 만족하는 삼각형 구하기
		// 1 <= a, b, c <= 100 (a, b, c는 변의 길이 (c가 가장크다고 가정))		
		// 피타고라스 공식 : a * a + b * b = c * c를 만족하는 삼각형 변의 길이 쌍을 출력하시오.
		// 총 몇 개의 삼각형이 피타고라스에 만족하는지도 확인해보세요!
		// 변의 길이 중복 허용
		// 변의 길이 중복 제거
//		int count = 0;
//		int count1 = 0;
//		for (int a = 1; a <= 100; a++) {
//			for (int b = 1; b <= 100; b++) {
//				for (int c = 1; c <= 100; c++) {
////					int max = a;
////					int left1 = b;
////					int left2 = c;
////					if (b > max) {
////						max = b;
////						left1 = a;
////						left2 = c;
////					}
////					if (c > max) {
////						max = c;
////						left1 = b;
////						left2 = a;
////					}
////					if (left1 > left2) {
////						if (left1 * left1 + left2 * left2 == max * max) {
////							count1++;
////						}
////					}
//					if((c >= a) && (c >= b)) {
//						if(a >= b) {
//							if(a * a + b * b == c * c) {
//								count1++;
//							}
//						}
//					}
//				}
//			}
//		}
//		System.out.println(count1);
//		System.out.println(count);
		
		
	}

}

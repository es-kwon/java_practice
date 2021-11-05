package while_loop;

import java.util.Scanner;

//import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// command + shift + o : 필요한 클래스가 자동으로 Import
		
		/* 반복문 : 어떤 문장이 반복되는 구조
		 * ex) 30명의 성적 입력받고 싶을 때
		 * ex) 1 ~ 45 로또값 6개 선택
		 * 
		 * while, do while, for
		 * 
		 * while(조건식) {
		 * 				문장;
		 * }
		 * : 조건식이 참일 때 동안 문장이 실행된다.
		 * : 조건이 한번이라도 거짓이되면 반복문은 종료된다.
		 * 
		 * */
		
//		int i = 0; // 반복문을 위한 임시변수 (반복 횟수 저장) (iterator)
//		
//		while (i < 5) {
//			System.out.println("hello!" + i);
//			i++; // i = i + 1;
//		}
//		System.out.println("while문 종료시 i = " + i); // 5
//		// i < 5 조건식이 거짓이 되는 순간은 i == 5 일 때
//		
//		i = 1;
//		while (i <= 5) {
//			System.out.println("hello!" + i);
//			i++; // i = i + 1
//			// int next = ++i
//			// i : 5
//			// 1) ++i; // 6
//			// 2) next = i; // next == i == 6
//			
//			// next = i++
//			// i : 5
//			// 1) next = i; // next == 5
//			// 2) i++; // i == 6
//		}
//		System.out.println(i); // 6
		
		/* while
		 * 1) 초기화 (i = 1)
		 * 2) 조건식 (i <= 5)
		 * 3) 증감식 (i++, ++i)
		 * * 만약 증감식이 없으면 무한 반복문 (무한 루프)에 빠지게 됨
		 * 
		 * * 무한 반복문 활용
		 * while(true){
		 * 
		 * }
		 * */
		
		// Q1. 사용자에게 문자 하나를 입력받아서 알파벳이 아니면 계속 입력
//		char ch = 0;
//		while(true) {
//			System.out.print("문자 하나 입력 : ");
//			ch = sc.next().toLowerCase().charAt(0);
//			
//			if ((ch >= 'a') && (ch <= 'z')) break; // 반복문 빠져나감
//			else System.out.println("[경고] 알파벳만 입력!");
//		} // while문의 종료
//		//
//		System.out.println("break에 의해 반복문 빠져나옴" + ch);
		
		
//		// Q2. 사용자에게 구구단 단수 (2 ~ 9단) 를 입력받아 구구단 출력 프로그램
//		
//		// 1) 사용자가 제대로된 값을 입력할 때까지 계속 받는 방법
//		// 2) 잘못 입력했을 경우 바로 종료하는 방법
//		
//		// 1)
//		System.out.print("단을 입력 : ");
//		
//		int times = 0;
//		int malt = 1;
//		while (true) {
//			times = sc.nextInt();
//			if ((times >= 2) && (times <= 9)) {
//				break;
//			}
//			else {
//				System.out.printf("[경고] %d단은 유효한 단이 아닙니다\n", times);
//				System.out.println("2 ~ 9 사이의 값을 입력하세요");
//				System.out.print("단을 입력 : ");
//			}
//		}
//		while (malt < 10) {
//			System.out.printf("%d * %d = %d\n", times, malt, times * malt);
//			malt++;
//		}
		
//		//2)
//		int times = sc.nextInt();
//		int malt = 1;
//		while (malt < 10) {
//			if (!((times >= 2) && (times <= 9))) {
//				System.out.printf("[경고] %d단은 유효한 단이 아닙니다\n", times);
//				System.out.println("2 ~ 9 사이의 값을 입력하세요");
//				System.out.print("단을 입력 : ");
//				times = sc.nextInt();
//			}
//			else {
//				System.out.printf("%d * %d = %d\n", times, malt, times * malt);
//				malt++;
//			}
//			}
		
//		// Q3. 5명의 컴퓨터 성적을 입력받아 성적의 합계와 평균을 구하는 프로그램
//		
//		int score = 0;
//		int sum = 0;
//		int i = 0;
//		
//		while (i < 5) {
//			if(score >= 0 && score <= 100) {
//				System.out.print((i + 1) + "번 성적을 입력하세요 : ");
//			}
//			score = sc.nextInt();
//			if (!(score >= 0 && score <= 100)) {
//				System.out.printf("[경고] %d점은 유효한 성적이 아닙니다\n", score);
//				System.out.printf("%d번 성적을 다시 입력하세요 : ", (i + 1));
//			}
//			else {
//				sum = sum + score;
//				i++;
//			}
//		}
//		System.out.println("합계 : " + sum);
//		System.out.println("평균 : " + (sum / 5.0));
		
//		// Q4. 5개의 숫자를 입력받아 최댓값, 최솟값을 구하는 프로그램
//		// 1) 사용자가 첫번째로 입력한 값을 min, max의 초기값으로 
//		// if (i == 0) max = num, min = num
//		// 2) max : 엄청 작은 값, min : 엄청 큰 값
//		// i == 0 일 때 무조건 초기화 될 수 있게 만듦
//		int num = 0;
//		int max = 0;
//		int min = 0;
//		int ii = 0;
//		
//		while (ii < 5) {
//			num = sc.nextInt();
//			if (ii == 0) {
//				max = num;
//				min = num;
//			}
//			if (num > max) {
//				 max = num;
//			}
//			if (num < min) {
//				min = num;
//			}
//			ii++;
//		}
		
//		int a = Integer.MIN_VALUE; // -2^31 // 최댓값 저장공간
//		int b = Integer.MAX_VALUE; // 2^31 - 1 // 최솟값 저장공간
//		System.out.println(a);
//		System.out.println(b);
		
//		
//		System.out.println("최댓값은 : " + max);
//		System.out.println("최솟값은 : " + min);
//		
//		// Q5. 1 ~ 10 중에서 3의 배수만 출력하는 프로그램
//		
//		int iii = 1;
//		
//		while (iii < 11) {
//			if (iii % 3 == 0) {
//				System.out.println(iii);
//			}
//			iii++;
//		}
//		
//		// Q6. 사용자에게 문자 하나 (알파벳, 숫자, 특수문자 모두 가능)를
//		// 입력받아 'q'문자가 들어오기 전까지 입력받은 문자를 하나의
//		// 문자열로 바꾸는 프로그램 (while(true) + break 문제)
//		// ex) 'a' 'b' 'c' '1' 'd' 'q' => "abc1d"
//		// 추가문제1) 문자열을 역순으로 저장할 수 있을지?
//		//  ex) 'a' 'b' 'c' '1' 'd' 'q' => "d1cba"
//		
//		String str = "";
//		String strSum = "";
//		
//		while (true) {
//			str = sc.next();
//			if (str.equals("q")) {
//				break;
//			}
//			else {
//				strSum = strSum + str; // Q6
////				strSum = str + strSum; // 추가문제 1
//			}
//		}
//		
//		System.out.println(strSum);
		
//		// Q7. 사용자에게 n을 입력받아 n!을 구하는 프로그램
//		// (n! = 1 * 2 * 3 * 4 * 5 .... n)
//		
//		int n = sc.nextInt();
//		int mult = 1;
//		int i = 1;
//		
//		while (i < n) {
//			mult = mult * (i + 1);
//			i++;
//		}
//		
//		System.out.println(mult);
		
		
	
	}
	
}


package condition;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); // 실제 행동하는 단위인 객체를 생성
		
		
//		// 사용자에게 두 정수를 입력 (Scanner)
//		System.out.print("첫 번째 정수 입력 : ");
//		int a = sc.nextInt();
//		System.out.print("두 번째 정수 입력 : ");
//		int b = sc.nextInt();
//		
//		// a / b (b != 0)
//		
//		// 프로그램의 흐름을 변경할 수 있는것이 제어문
//		// 제어문 중 하나가 조건문
//		
//		// 조건식 (true / false로 판단가능한 식)
//		if (b == 0) { // 블록 (block)
//			System.out.println("계산 불가!");
//			System.out.println("0으로 나눌 수 없습니다!");
//		}
//		else { // b != 0
//			double div = (double) a / b;
//			System.out.println(div);
//		}
		
//		if(b == 0)
//			System.out.println("계산 불가!");
//		// 이렇게 할 수도 있지만 한줄짜리 라도 블록 처리 하자!
//		// 실행될 문장이 하나밖에 없다 ==> 오른쪽에 붙여서 작성!

//		// 일반적인 문장 (평서문)
//		System.out.println("언제 실행될까요?"); // 항상 실행
		
		// Q1. 사용자에게 국어, 수학, 영어 성적 받아서 70점 넘으면 "합격"
		// 70점 넘지 않으면 "불합격" (if-else)
			// 1) 국어, 수학, 영어 (0미만, 100 초과는 유효하지 않음)
		
//		System.out.print("국어 점수 : ");
//		int kor = sc.nextInt();
//		System.out.print("수학 점수 : ");
//		int mat = sc.nextInt();
//		System.out.print("영어 점수 : ");
//		int eng = sc.nextInt();
//		
//		double avg = (kor + mat + eng) / 3.0;
//		boolean avgChk = avg > 70;
//		System.out.printf("평균 점수 : %.2f\n", avg);
//		
//		// 1번 문제
//		if (avgChk) {
//			System.out.println("합격");
//		}
//		else {
//			System.out.println("불합격");
//		}
//		
//		// 1-1번 문제
//		if ((kor < 0 || kor > 100) || (mat < 0 || mat > 100) || (eng < 0 || eng > 100)) {
//			System.out.println("[에러] : 유요하지 않은 성적 데이터입니다");
//		}
//		else {
//			avg = (kor + mat + eng) / 3.0;
//			avgChk = avg > 70;
//			// 값이 유요한지부터 판단하고 평균을 계산
//			
//			if (avgChk) {
//				System.out.println("합격");
//			}
//			else {
//				System.out.println("불합격");
//			}
//		}
		
		//
//		int kor = sc.nextInt();
//		if (kor > 100 || kor < 0) {
//			System.out.println("[에러] : 유효하지 않은 국어성적 입니다");
//		}
//		else {
//			int mat = sc.nextInt();
//			if (mat > 100 || mat < 0) {
//				System.out.println("[에러] : 유효하지 않은 수학성적 입니다");
//			}
//			else {
//				int eng = sc.nextInt();
//				if (eng > 100 || eng < 0) {
//					System.out.println("[에러] : 유효하지 않은 영어성적 입니다");
//				}
//				else {
//					double avg = (kor + mat + eng) / 3.0;
//					boolean avgChk = avg > 70;
//					
//					if (avgChk) {
//						System.out.println("합격");
//					}
//					else {
//						System.out.println("불합격");
//					}
//				}
//			}
//		}
		
		// Q2. 사용자에게 세 변의 길이(정수)를 입력 받아서
		// 세 변으로 삼각형을 만들 수 있는지 확인하는 프로그램
		// a, b, c (c가 가장 크다고 가정)
		// a + b > c

//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		int big;
		
//		if ((a > b) && (a > c)) {
//			boolean triangle1 = (b + c) > a;
//			if (triangle1) {
//				System.out.println("삼각형을 만들 수 있습니다");
//			}
//			else {
//				System.out.println("삼각형을 만들 수 없습니다");
//			}
//		}
//		else {
//			if ((b > a) && (b > c)) {
//				boolean triangle2 = (a + c) > b;
//				if (triangle2) {
//					System.out.println("삼각형을 만들 수 있습니다");
//				}
//				else {
//					System.out.println("삼각형을 만들 수 없습니다");
//				}
//			}
//			else {
//				boolean triangle3 = (a + b) > c;
//				if (triangle3) {
//					System.out.println("삼각형을 만들 수 있습니다");
//				}
//				else {
//					System.out.println("삼각형을 만들 수 없습니다");
//				}
//			}
//		}
		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		int big;
//		
//		// 값의 유효성 체크
//		if (a <= 0) {
//			System.out.println("유효하지 않은 값 입니다");
//			return;
//		}
//		if (b <= 0) {
//			System.out.println("유효하지 않은 값 입니다");
//			return;
//		}
//		if (c <= 0) {
//			System.out.println("유효하지 않은 값 입니다");
//			return;
//		}
//		
//		
//		// 가장 큰 수를 체크 하는 방법 1
//		if ((a >= b) && (a >= c)) {
//			big = a;
//		}
//		else {
//			if (b >= c) {
//				big = b;
//			}
//			else {
//				big = c;
//			}
//		}
//		
//		// 가장 큰 수를 체크 하는 방법 2
//		big = a;
//		if (b > big) big = b;
//		if (c > big) big = c;
//		
//		
//		// 삼각형의 유효성 검사
//		int sum = a + b + c - big;
//		if (sum > big) {
//			System.out.println("삼각형을 만들 수 있습니다");
//		}
//		else {
//			System.out.println("삼각형을 만들 수 없습니다");
//		}
		
//		// 제일 큰 수 : a, b, c
//		// a > b && a > c
//		// b > a && b > c
//		// c > a && c > b
//		// Q3. 사용자에게 입력받은 세 정수 중 가장 큰 수를 구하는 프로그램
//		
//		System.out.println("세 정수를 입력 (ex) 3 5 6) : ");
//	
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		int max;
//		
//		if(a > b) {
//			if(a > c) {
//				max = a;
//			}
//		}
//		else { // b >= a
//			if(b > c) { // b >= a && b > c
//				max = b;
//			}
//			else { // c >= b >= a
//				max = c;
//			}
//		}
//		
//		// else if : 위의 조건이 틀렸고 만약에
//		if(a > b && a > c) {
//			max = a;
//		}
//		else if(b > c && b > c) { // a <= b || a <= c
//			max = b;
//		}
//		else if(c > a && c > b) {
//			max = c;
//		}
//		else {
//			
//		}
		
		// Q4. 사용자에게 문자 하나 (char)를 입력 받아 소문자로 변경
		// 소문자 -> 소문자, 대문자 -> 소문자
		// toLowerCase() 사용 불가
		
//		char ch = sc.next().charAt(0);
//		int chck = (int)ch;
//		if ((ch >= 'A') && (ch <= 'Z')) {
//			chck = ch + ' ' ;
//		}
//		
//		System.out.println((char)chck);
		
//		// 4-1 알파벳 이외의 다른 문자가 들어올 경우 제외
//		
//		// 알파벳 입력
//		System.out.print("알파벳 입력 : ");
//		char ch = sc.next().charAt(0);
//		
//		// 입력된 문자가 알파벳인지 체크
//		if ((ch < 'A') || ((ch > 'Z') && (ch < 'a')) || (ch > 'z')) {
//			System.out.println("[에러] : 알파벳만 입력하세요");
//			return;
//		}
//		
//		// 대문자인지 체크
//		if (ch <= 'Z') ch = (char)(ch + ('a' - 'A'));
//								// 문자끼리 사칙연산은 정수 (아스키코드값) 끼리 사칙연산과 동일
//		
//		// ch += ('a' - 'A'); << 가능
//		
//		System.out.println(ch);
		
		// Q5. 학점 판단 프로그램
		// 사용자에게 점수를 하나 입력받아
		// (유효하지 않은 데이터 100점 초과, 0점 미만 오류로 출력)
		// 90점 이상이면 : 'A'
		// 80 <=        < 90 : 'B'
		// 70 <=        < 80 : 'C'
		// 60 <=        < 70 : 'D'
		// 60점 미만 : 'F'
		
//		int score = sc.nextInt();
//		
//		if(score > 100 || score < 0) {
//			System.out.println("유효하지 않은 점수");
//			return;
//		}
//		if(score >= 90) {
//			System.out.println("A");
//		}
//		else if(score >= 80) {
//			System.out.println("B");
//		}
//		else if(score >= 70) {
//			System.out.println("C");
//		}
//		else if(score >= 60) {
//			System.out.println("D");
//		}
//		else {
//			System.out.println("F");
//		}

				
//		// Q6. 간단한 계산기 (x, y 정수)
//		// ex) 3 + 4
//		// 연산 (+, -, *, / (0으로 나누는 경우 제외(오류출력))
//		
//		System.out.print("수식을 입력하세요 (ex) x + y) : ");
//		int x = sc.nextInt();
//		char op = sc.next().charAt(0);
//		int y = sc.nextInt();
//
//		if (op == '+') {
//			System.out.println("결과 : " + (x + y));
//		}
//		else if (op == '-') {
//			System.out.println("결과 : " + (x - y));
//		}
//		else if (op == '*') {
//			System.out.println("결과 : " + (x * y));
//		}
//		else if (op == '/') {
//			if (y == 0) {
//				System.out.println("계산할 수 없습니다");
//			}
//			else {
//				System.out.println("결과 : " + ((double)x / y));
//			}
//		}
			
		
//		// Q7. 사용자에게 문자 (알파벳, 숫자) 하나를 입력받아
//		// 해당 문자가 소문자인지, 대문자인지, 숫자인지 판단하는 프로그램
//		// (나머지 경우에 대해서는 특수문자라고 출력)
//		
//		System.out.print("문자 하나를 입력 : ");
//		char ch = sc.next().charAt(0);
//
//		if ((ch >= '0') && (ch <= '9')) {
//			System.out.println("숫자 입니다");
//		}
//		else if ((ch >= 'A') && (ch <= 'Z')) {
//			System.out.println("대문자 입니다");
//		}
//		else if ((ch >= 'a') && (ch <= 'z')) {
//			System.out.println("소문자 입니다");
//		}
//		else {
//			System.out.println("특수문자 입니다");
//		}

		// Q8. 사용자에게 두 점(실수)을 입력받아
		// 해당 점의 사분면 판단 프로그램
		// (원점, x축, y축 위에 점이 생길수도 있음)
		
//		System.out.print("두 점을 입력하세요 (ex : x y) : ");
//		double x = sc.nextDouble();
//		double y = sc.nextDouble();
//		
//		if (x == 0 && y == 0) {
//			System.out.println("원점");
//		}
//		else if (x != 0 && y == 0) {
//			System.out.printf("x 축 위 %.2f지점", x);
//		}
//		else if (x == 0 && y != 0) {
//			System.out.printf("y 축 위 %.2f지점", y);
//		}
//		else if (x > 0 && y > 0) {
//			System.out.printf("제1사분면 위 (%.2f, %.2f)지점", x, y);
//		}
//		else if (x < 0 && y > 0) {
//			System.out.printf("제2사분면 위 (%.2f, %.2f)지점", x, y);
//		}
//		else if (x < 0 && y < 0) {
//			System.out.printf("제3사분면 위 (%.2f, %.2f)지점", x, y);
//		}
//		else {
//			System.out.printf("제4사분면 위 (%.2f, %.2f)지점", x, y);
//		}
		
		int score = 95;
		char gpa = 0; // 항상 변수를 만들때 초기화 하고 시작하자! (initialization)
		String str = ""; // String은 "" (빈 문자열)로 초기화 한다 
		
		if(score >= 90) {
			gpa = 'a';
		}
		else if(score >= 70) {
			gpa = 'b';
		}
		else if(score >= 80) {
			gpa = 'c';
		}
		else if(score >= 60) {
			gpa = 'd';
		}
		else { // else 가 없으면 gpa 값이 초기화 되지 않아서 컴파일러에서 오류를 나타낸다
			gpa = 'x'; // 위의 if문 중 만족하는 것이 없을 때 gpa값이 없어서...
		}
		
		System.out.println(gpa);
		
		/*
		 * int a = 1; 의 구성
		 * 1) int a; // declaration
		 * 2) a = 1; // initialization
		 * 
		 * */
		
		
	}

}

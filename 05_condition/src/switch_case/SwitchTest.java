package switch_case;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		/*
		 * a = 3;
		 * 
		 * switch 변수에 들어갈 수 있는 데이터 타입
		 * : 정수, 문자, 문자열(equals로 비교)
		 * 
		 * switch (a) {
		 *	 case 1: // a == 1
		 *			문장;
		 *			break; // switch 종료 (vs for break) 
		 *	 case 2: // a == 2
		 *			문장;
		 *			break;
		 *  case 3: // a == 3
		 * 			문장;
		 *			break;
		 *	 default; // if 문에서 else랑 유사, 따라서 생략가능
		 *			문장;
		 *			break; // default 에서 생략 가능
		 * }
		 *  
		 *  switch의 장점
		 *  
		 *  1) 코드 간결
		 *  2) == 생략 되어있다는 걸 알고 시작 -> 가독성
		 *  
		 *  if (a == 1) {
		 *  			문장;
		 *  }
		 *  else if (a == 2) {
		 *  			문장;
		 *  }
		 *  else if (a == 3) {
		 *  			문장;
		 *  }
		 * 
		 * */
		
//		// Q1. 사용자에게 수를 입력 받아 해당 수가 1, 2, 3 인지 확인
//		// Q2. 사용자에게 현재 월을 입력 받아 해당 월을 문자로 출력하는 프로그램
//		System.out.print("1 ~ 3 중 하나를 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		switch(num) {
//		case 1 :
//			System.out.println("1");
//			break;
//		case 2 :
//			System.out.println("2");
//			break;
//		case 3 :
//			System.out.println("3");
//			break;
//		default :
//			System.out.println("1, 2, 3 중에 입력하세요");
//		}
//		
//		
//		System.out.print("1 ~ 4월 중 하나를 입력하세요 : ");
//		int month = sc.nextInt();
//		
//		switch(month) {
//		case 1 :
//			System.out.println("jan");
//			break;
//		case 2 :
//			System.out.println("feb");
//			break;
//		case 3 :
//			System.out.println("mar");
//			break;
//		case 4 :
//			System.out.println("apr");
//			break;
//		default :
//			System.out.println("1, 2, 3, 4 중에 입력하세요");
//		}
//		
//		
//		String str = "a";
//	      switch(str) {
//	         case "a":
//	            System.out.println("a");
//	            break;
//	         case "b":
//	            System.out.println("b");
//	            break;
//	         default:	// else
//	            System.out.println("others");
//	            break;
//	      }
	      
//	      float f = 12.34f; 	// == 비교 연산자로 float을 비교할 수 없음...
//	      switch(f) {
//	         case 12.34:
//	            System.out.println("a");
//	            break;
//	         case 45.67:
//	            System.out.println("b");
//	            break;
//	         default:
//	            System.out.println("others");
//	            break;
//	      }
	      
	      
//	      // 의도적으로 break를 생략하는 경우
//	      // 사용자에게 월을 입력받아 해당 월의 마지막 일자를 구하는 프로그램
//	      System.out.print("월 입력");
//	      int month2 = sc.nextInt();
//	      int totalDays = 0;
//	      switch(month2) {
//	      case 1:
//	      case 3:
//	      case 5:
//	      case 7:
//	      case 8:
//	      case 10:
//	      case 12:
//	    	  totalDays = 31;
//	    	  break;
//	      case 4:
//	      case 6:
//	      case 9:
//	      case 11:
//	         totalDays = 30;
//	         break;
//	         
//	      case 2:
//	    	  totalDays = 28;
//	    	  break;
//	    	  
//	      default : 
//	    	  totalDays = -1; // 연산의 오류
	      
	      
//	      }
	      
	// Q1. 사용자에게 연도를 입력받아 윤년검사하고 윤년 -> 29일, 평년 -> 28일
	//  1) 4의 배수이어야하고 100의 배수가 아니어야 함
	//  2) 400의 배수는 무조건 윤년이 됨
	// Q2. totalDays를 출력 (+연도, 월 같이)
	
//	System.out.print("연도를 입력 : ");
//	int year = sc.nextInt();
//	System.out.print("월을 입력 : ");
//	int month = sc.nextInt();
//	int totalDays = 0;
//	if (!(month >= 1 && month <= 12)) {
//		System.out.println("유효하지 않은 월 입니다");
//		return;
//	}
//
//	switch (month) {
//	// (month == 1) || (month == 3) || (month == 5) .....
//	// ** month == 	부분을 switch case문에서는 생략가능 (가독성 ^)
//	
//	case 1:
//	case 3:
//	case 5:
//	case 7:
//	case 8:
//	case 10:
//	case 12:
//		totalDays = 31;
//		break;
//	case 4:
//	case 6:
//	case 9:
//	case 11:
//		totalDays = 30;
//		break;
//	case 2:
//		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
//			totalDays = 29;
//		}
//		else {
//			totalDays = 28;
//		}
//		break;
//	default :
//		totalDays = -1;
//	}
//	
//	System.out.printf("%d년 %d월은 %d일 까지 있습니다\n", year, month, totalDays);
		
	
    // Q3. switch문을 이용해서 사용자에게 문자 하나를 입력받아
    // 모음과 자음을 판별하는 프로그램을 작성
    // (사용자의 입력이 대소문자 구분없이 들어와도 가능해야함)
	
	System.out.print("알파벳 하나를 입력 : ");
	String str = sc.next();
	char aph = str.toLowerCase().charAt(0);
	
	if (!((aph >= 'a') && (aph <= 'z'))) {
		System.out.println("유효하지 않은 문자입니다");
		return;
	}
	
	switch(aph) {
	case 'a' :
	case 'e' :
	case 'i' :
	case 'o' :
	case 'u' :
		System.out.printf("%s는 모음입니다", str);
		break;
	default :
		System.out.printf("%s는 자음입니다", str);
	}
	
	      
		
	}

}

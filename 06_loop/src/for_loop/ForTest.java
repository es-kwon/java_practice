package for_loop;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
//		// while 3가지
//		// 1) 초기화
//		// 2) 조건식
//		// 3) 증감식
//		
//		// for(초기화; 조건식; 증감식) {
//		// 							문장;
//		// }
//		
//		int i = 0;
//		for(i=0; i < 5; i++) {
//			System.out.println(i);
//		}
//		System.out.println(i); // 5
//		
//		i = 0;
//		for(i=5; i > 0; i--) {
//			System.out.println(i);
//		}
//		System.out.println(i); // 0
//		
////		for(;;) {
////			System.out.println("??");
////		}
//		// while(true){}와 동일하게 무한루프
//		
//		// Q1. i == 0, 2, 4, 6, 8, 10
//		
//		i = 0;
//		for(i = 0; i < 11; i += 2) {
//			System.out.println(i);
//		}
//		
//		// Q2. i == 1 3 5 7 9
//		
//		for(i = 1; i < 10; i += 2) {
//				System.out.println(i);
//		}
//		
//		// Q3. 1 ~ 10 까지 합계
//		
//		int sum = 0;
//		for(i = 0; i < 11; i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
//		
//		// Q4. (무한루프 문제) 사용자에게 -1이 나오기 전까지
//		// 양의 정수를 입력받아
//		// 몇개의 양의정수가 입력되었는지 카운팅 프로그램
//		
//		int count = 0;
//		int i = 0;
//		for(;;) {
//			i = sc.nextInt();
//		if(i == -1) break;
//			if (i > 0) {
//				count++;
//			}
//		}
//		System.out.println(count);
		
//		// break : 반복문 종료
//		// countinue : 반복문 다시 시작
//		for(int i = 0; i < 11; i++) {
//			if(i % 3 == 0) {
//				continue;
//			}
//			System.out.print(i + " ");
//		}
//		
//		System.out.println();
//		
//		// 다음과 같은 continue 문장은 의미가 없음
//		// 이유 ? 이미 출력을 하고 무시를 하는것 이기 때문
//		
//		for(int i = 0; i < 11; i++) {
//			System.out.println(i);
//			
//			if(i % 3 == 0) {
//				continue;
//			}
//		}
//		
//		
//		
//		// Q5.
//		// 1 ~ 100사이의 랜덤값 (Math.random())을 정답으로 지정
//		// 사용자가 정답을 추측하는 게임
//		// if(answer > guess) UP
//		// else if(answer < guess) Down
//		// else 정답!
//		// 시도횟수도 같이 출력
//		
//		int answer = (int)(Math.random() * 100) + 1;
//		int count = 0;
//		int guess = 0;
//		
//		for (count = 1;;count++) {
//			System.out.print("수를 입력 : ");
//			guess = sc.nextInt();
//			if (!((guess >= 0) && (guess <= 100))) {
//				System.out.println("올바르지 않은 수, 1 ~100사이를 입력하시오");
//				continue;
//			}
//			if (guess < answer) {
//				System.out.println("UP!!");
//			}
//			else if (guess > answer){
//				System.out.println("DOWN!!");
//			}
//			else {
//				System.out.println("정답입니다!");
//				System.out.printf("시도횟수는 %d회\n",count);
//				break;
//			}
//		} 
		
		// Q6. 김밥천국 문제
		// 얼마 가지고 있니? 10000
		// ==========================
		// 1. 김밥 (2500)
		// 2. 라면 (3000)
		// 3. 떡볶이 (4000)
		// 4. 돈까스 (5000)
		// 5. 종료
		// ==========================
		
		// 메뉴 주문번호 1번
		// 김밥 선택했습니다
		// 잔돈은 7500원입니다
		
		// 메뉴 주문번호 2번
		// 라면 선택했습니다
		// 잔돈은 4500원입니다
		
		// 메뉴 주문번호 5번
		// 종료
		// 잔돈은 4500원입니다
		
		// 조건
	    // 1) 만약 본인이 가진 돈보다 비싼 메뉴를 골랐을 경우
	    // 돈이 부족합니다! 라는 메시지를 출력 -> 다시 메뉴 선택 ok
	    // 2) 잔돈이 0이면 종료 ok
	    // 3) (추가) 만약 가진 돈이 메뉴 가격의 최솟값보다 작으면 시작할 수 없음
	    // 4) 가진 돈이 유효하지 않은 데이터일 수도 있음 (그럴 경우 다시 입력받게)
		// 5) 1 ~ 5 사이 메뉴를 입력하지 않았을 경우 오류 출력
		
		int change = 10000;
		int menu = 0;
		String menuStr = "";
		int price = 0;
		
		while (true) {
			System.out.print("얼마를 가지고 있니? : ");
			change = sc.nextInt();
			if(change > 0 ) {
				break;
			}
			System.out.println("유효하지 않은 금액");
		}
			
		
		for(;;) {
			if (change < 2500) {
				System.out.println("가진돈으로 살수 있는 것이 없습니다");
				System.out.println("종료");
				break;
			}
				System.out.println("==========================");
				System.out.println("1. 김밥 (2500)");
				System.out.println("2. 라면 (3000)");
				System.out.println("3. 떡볶이 (4000)");
				System.out.println("4. 돈까스 (5000)");
				System.out.println("5. 종료");
				System.out.println("==========================");
				System.out.println();
				System.out.print("메뉴를 하나 선택해주세요 : ");
				menu = sc.nextInt();
				
				if (menu == 1) {
					price = 2500;
					menuStr = "김밥";
				} 
				else if (menu == 2) {
					price = 3000;
					menuStr = "라면";
				} 
				else if (menu == 3) {
					price = 4000;
					menuStr = "떡볶이";
				} 
				else if (menu == 4) {
					price = 5000;
					menuStr = "돈까스";
				} 
				else if (menu == 5) {
					System.out.println("종료");
					break;
				}
				else {
					System.out.println("잘못 선택하셨습니다 1~5 사이 숫자를 선택하세요");
					System.out.println();
					continue;
				}
				
				if (change == price) {
					System.out.printf("메뉴 주문번호 : %d\n", menu);
					System.out.printf("%s 선택 했습니다\n", menuStr);
					System.out.println("잔돈은 0원 입니다");
					System.out.println();
					System.out.println("종료");
					break;
				}
				else if (change > price) {
					change -= price;
					System.out.printf("메뉴 주문번호 : %d\n", menu);
					System.out.printf("%s 선택 했습니다\n", menuStr);
					System.out.printf("잔돈은 %d원 입니다\n", change);
					System.out.println();
				}
				else {
					System.out.println("돈이 부족합니다!");
					System.out.println("다시 선택하세요");
					System.out.printf("잔돈은 %d원 입니다\n", change);
					System.out.println();
					continue;
				}
			

		}

	}

}
		
		
		




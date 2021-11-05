package do_while;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 반복문 : while(**), do while, for(*******)
		
		
//		do {
//				문장
//		} while(조건식); // 마지막 세미콜론 붙음
		
		// 1) 일단 무조건 문장을 실행 (조건 참/거짓과 상관없이 최소 한 번은 문장이 무조건 실행됨)
		// 2) 조건문은 반복문 끝에서 검사
		
		int i = 0;
		do {
			System.out.println("hello !" + i);
			i++;
		} while(i < 3);
		System.out.println(i); // 3
		
		i = 0;
		do {
			System.out.println("hello !" + i);
			i++;
		} while(i > 3); // 조건 거짓
		System.out.println(i); // 1
	
//		// do while() 구문은 while(true)로 대체 가능함
//		while(true) {
//			if() break;
//		}
		
		i = 0;
		while (true) {
			System.out.println("hello !" + i);
			i++;
			if (!(i > 3)) {
				break;
			}
		}
		

		
	}

}

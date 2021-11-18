package recursive_function;

public class RecursiveFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 순환 / 재귀 함수 (자기 호출 함수, recursive function)
		// : 함수 내에서 스스로를 호출하는 함수
		
		// ex) 피보나치 (0번째 항 -> 0, 1번째 항 -> (정해짐)
		//  index : 0 1 2 3 4 5 6 7 8 9 ......... 98 99 100
		//  value : 0 1 1 2 3 5 8 13 21
		
		// 인덱스 n에 대한 피보나치 값?
		
		System.out.println(fibor_for(10));
		System.out.println(fibor_recur(10));

		
	}

	public static int fibor_for(int n) {
		int[] values = new int[n + 1];
		values[0] = 0;
		values[1] = 1;
		
		for(int i = 2; i < values.length; i++) {
			values[i] = values[i - 1] + values[i - 2];
		}
		
		// 인덱스 n
		return values[n];
	}
	
	// 재귀 함수 : 실행 속도가 느림 (중복되는 항 계산 많음), 가독성은 좋음
	// 잘 안씀
	public static int fibor_recur(int n) {
		
		// 종료 구문
		if (n == 0) return 0;
		else if (n == 1) return 1;
		
		// 재귀 구문
		// n >= 2
		return fibor_recur(n - 2) + fibor_recur(n - 1);
	}
	
}

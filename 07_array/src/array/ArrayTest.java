package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 배열 (array) : 동일한 데이터 타입(***)의 서로 관계있는 데이터 여러개를 저장할 수 있는 공간
		 * 
		 * : 하나의 변수이름으로 접근이 가능 (인덱스를 통해)
		 * 
		 * ex) 5명 학생에 대한 5개 과목 성적 평균 구하는 문제에서 1번학생의 국어 성적?
		 * 
		 */

		/*
		 * 기본 타입 : int double, float, char, boolean -> 변수 공간에 데이터 자체를 저장
		 * 
		 * 참조타입 : 배열, String, 클래스 ...... => 변수 공간에 주소값을 저장 => 메모리의 주소값을 알고 있으면 원소값을 찾을 수
		 * 있음 ex) score : 첫 번째 원소의 위치 (주소값)
		 * 
		 */

		int[] scores = new int[5];

		// 5명의 성적을 저장할 수 있는 배열 (자바 스타일)
		// 여기서 대괄호는 scores라는 변수가 int 형 변수가 아니고
		// int [] 형 변수 (int형 데이터를 여러개 저장할 수 있는 배열)
		
		// 배열을 선언하자마자 데이터 초기화하는경우 (new 사용 X)
		int[] arr1 = {1, 2, 3};
		
		// for each (인덱스 없이 간단하게 배열 원소 순서대로 출력)
		for(int element : arr1) {
			System.out.println(element);
		}
		
//		int scores [] = new int[5];
		// C언어 스타일 배열 선언

		// new int[5]:  메모리 공간(힙)에 int형 할당할수있는 5칸을 만듦
		// new는 배열의 원소가 다음과 같이 초기화 됨
		// - int : 0
		// - double / float : 0.0 / 0.0f
		// - boolean : false
		// - char : null
		
		// 배열에서 각 원소를 접근하는 방법
		// 인덱스 (index) : 원소의 순번 (0번 부터 시작)
		scores[0] = 90;
		scores[1] = 85;
		scores[2] = 90;
		scores[3] = 60;
		scores[4] = 70;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++) {
			System.out.printf("%d번 학생 성적 입력 : ", i + 1);
			scores[i] = sc.nextInt();
		}
//		scores[5] = 60; // ArrayIndexOutofBounds

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("평균 : " + (double) sum / scores.length);

		// Q1. 성적중에 최댓값, 최솟값

		// 학생 성적을 저장
		int max = scores[0];
		int min = scores[0];
		// 학생 번호를 저장
		int max_index = 0;
		int min_index = 0;
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
				max_index = i;
			}
			if (scores[i] < min) {
				min = scores[i];
				min_index = i;
			}

		}
		System.out.println("최댓값은 : " + max);
		System.out.println("최솟값은 : " + min);
		System.out.println(max_index + 1);
		System.out.println(min_index + 1);

		// Q2. 성적중에 TOP 3
		// TOP 3 학생의 번호도 같이 출력

		int[] top = new int[5];
//		top[0] = max;
//		top[1] = min;
//		top[2] = min;
		int[] top_index = new int[5];
		top_index[0] = max_index;
//		for (int i = 0; i < scores.length; i++) {
//			if ((scores[i] != top[0]) && (scores[i] > top[1])) {
//				top[1] = scores[i];
//				top_index[1] = i;
//			}
//		}
//		for (int i = 0; i < scores.length; i++) {
//			if ((scores[i] != top[1]) 
//					&& (scores[i] > top[2]) && (scores[i] != top[0])) {
//				top[2] = scores[i];
//				top_index[2] = i;
//			}
//		}
		int[] scores_copy = new int[scores.length];
		for (int i = 0; i < scores.length; i++) {
			scores_copy[i] = scores[i];
		}
//		for(int i = 0; i < scores_copy.length; i++) {
//			System.out.println(scores_copy[i]);
//		}
		for (int i = 0; i < top.length; i++) {
			top[i] = scores_copy[0];
			for (int j = 0; j < scores.length; j++) {
				if (scores_copy[j] >= top[i]) {
					top[i] = scores_copy[j];
					top_index[i] = j;
				}
			}
			scores_copy[top_index[i]] = -1;
			System.out.printf("top%d(은)는 : ", i + 1);
			System.out.println(top[i]);
		}
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
//		System.out.println("TOP1 : " + top[0]);
//		System.out.println("TOP2 : " + top[1]);
//		System.out.println("TOP3 : " + top[2]);
//		System.out.println(top_index[0] + 1);
//		System.out.println(top_index[1] + 1);
//		System.out.println(top_index[2] + 1);
//
//		// Q3. 학점 계산
//		// 90점 이상 -> A
//		// 80점 이상 -> B
//		// 70점 이상 -> C
//		// 60점 이상 -> D
//		// 이외 성적 -> F
//
//		for (int i = 0; i < scores.length; i++) {
//			if (scores[i] >= 90) {
//				System.out.printf("%d의 학점은 A\n", i + 1);
//			} else if (scores[i] >= 80) {
//				System.out.printf("%d의 학점은 B\n", i + 1);
//			} else if (scores[i] >= 70) {
//				System.out.printf("%d의 학점은 C\n", i + 1);
//			} else if (scores[i] >= 60) {
//				System.out.printf("%d의 학점은 D\n", i + 1);
//			} else {
//				System.out.printf("%d의 학점은 F\n", i + 1);
//			}
//		}
//
//		int score1;
//		int score2;
//		int score3;
//		int score4;
		// ...

//		// Q2. 
//		// 총 5명의 5개의 과목 성적 (국, 수, 사, 과, 영)
//		// 출력)
//		// 1번째 학생의 성적 입력 : 50 40 90 80 85
//		// 1번째 학생의 평균은 69점 입니다.
//		// 2번째 학생의 성적 입력 : 50 40 90 80 85
//		// 3번째 학생의 성적 입력 : 50 40 90 80 85
//		
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
//		
//		System.out.println(score); // 5번 학생의 영어 성적 (마지막 데이터)
		
		// 배열 선언하자마자 데이터 초기화 하는경우 (new 사용 x)
//		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};
		
		// 배열을 구성하고 있는 원소값 동일한지 확인
		// 1) 배열의 사이즈가 같은지?
		// 2) 배열의 원소값이 동일한지?
		System.out.println(arr1 == arr2); // 두 배열이 같은 객체 인지?
		System.out.println(arr1.equals(arr2)); // 두 배열이 같은 객체 인지?
		System.out.println(Arrays.equals(arr1, arr2)); // 두 배열의 원소가 모두 동일한지?
		
		// 배열을 구성하고 있는 원소값 동일한지 확인
		// == Arrays.equals(arr1, arr2);
		// 1) 배열의 사이즈가 같은지?
		// 2) 배열의 원소값이 동일한지?
		boolean isEquals = true;
		if (arr1.length != arr2.length) 
			{
			isEquals = false;
			return;
			}	
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				isEquals = false;
				break;
			}
		}
		System.out.println(isEquals ? 
				"두 배열의 원소값은 동일" : "두 배열의 원소값이 동일하지 않음");
		
		// 배열 복사의 잘못된 예시
		
		int[] arr1_wrong = {1, 2, 3};
		int[] arr1_wrong_copy = arr1_wrong;
		// arr1 배열 이름 자체는 첫번째 원소의 주소값을 가지기 때문에
		// arr1_copy = arr1 (원본 주소값 복사)
		
		arr1_wrong_copy[0] = 10;
		for(int i = 0; i < arr1_wrong.length; i++) {
			System.out.println(arr1_wrong[i]);
		}
		for(int i = 0; i < arr1_wrong_copy.length; i++) {
			System.out.println(arr1_wrong_copy[i]);
		}
		
		// 배열 복사의 정확한 예시
		int[] arr1_copy = new int[arr1.length]; // 새로운 공간 만듦
		for(int i = 0; i < arr1_copy.length; i++) {
			arr1_copy[i] = arr1[i];
			// 주소는 알려주지 않고 데이터만 복사
		}
		
		arr1_copy[0] = 10;
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		for(int i = 0; i < arr1_copy.length; i++) {
			System.out.println(arr1_copy[i]);
		}
		
		// Q
		

	}

}

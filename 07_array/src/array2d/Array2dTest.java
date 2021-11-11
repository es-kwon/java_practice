package array2d;

import java.util.Scanner;

public class Array2dTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 이차원 배열
		// ex) 학생 5명 존재하고 각 학생당 성적 (국, 수, 사, 과, 영)들을 저장한다고 가정
		// [행][열]
		Scanner sc = new Scanner(System.in);
		int[][] scores = new int [5][5];
//		int[][] scores = {{10, 20, 30}, 
//				{10, 20, 30},
//				{10, 20, 30}};
		
//		System.out.println(scores.length); // 행의 길이
//		System.out.println(scores[0].length); // 열의 길이
		
		// 사용자에게 입력받기
		// scores[0].length == scores[1].length == scores[2].length 
		// == scores[3].length == scores[4].length;  
//		for(int i = 0; i < scores.length; i++) { // scores.length => 행의 길이
//			for(int j = 0; j < scores[i].length; j++) { // scores[i].length => 열의 길이
//				scores[i][j] = sc.nextInt();
//			}
//		}
		
//		// Q1. 학생 1 ~ 5번, 각 학생의 성적 (국, 수, 사, 과, 영) 평균
//		int[] sum = new int[scores.length];
//		for(int i = 0; i < scores.length; i++) {
//			for(int j = 0; j < scores[i].length; j++) {
//				scores[i][j] = sc.nextInt();
//				sum[i] += scores[i][j];
//			}
//			System.out.println((double)sum[i] / scores[i].length);
//		}
//		
//		// Q2. 학생 3번의 영어 성적 출력
//		System.out.println(scores[2][4]);
//		
//		// Q3. 과목별 학생의 평균
//		int[] sum2 = new int[scores[0].length];
//		for(int i = 0; i < scores[0].length; i++) {
//			for(int j = 0; j < scores.length; j++) {
//				sum2[i] += scores[j][i];
//			}
//			System.out.println((double)sum2[i] / scores.length);
//		}
//		
//		// Q4. 과목별 최고 성적 받은 학생 번호, 점수 출력
//		int max = 0;
//		int max_index = 0;
//		int[][] maxArr = new int[scores[0].length][2]; // 1열 : max, 2열 : max_index
//		for(int i = 0; i < scores[0].length; i++) {
//			max = 0;
//			for(int j = 0; j < scores.length; j++) {
//				if (scores[j][i] > max) {
//					max = scores[j][i];
//					max_index = j;
//					maxArr[i][0] = scores[j][i];
//					maxArr[i][1] = j;
//				}
//			}
//			System.out.printf("%d과목 최고 성적 : %d, 학생 : %d\n", i, max, max_index);
//		}
//		String[] courName = {"국어", "수학", "사회", "과학", "영어"};
//		for(int i = 0; i < maxArr.length; i++) {
//			System.out.printf("%s과목 최고 성적 : %d, 학생 : %d\n", courName[i], maxArr[i][0], maxArr[i][1]);
//		}
//		
//		int[][] arr1 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
//		int[][] arr2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
//		
//		// Q5. 두 배열의 원소가 동일한지 확인하는 코드
//		boolean isEquals = true;
//		if((arr1.length != arr2.length) || (arr1[0].length != arr2[0].length)) {
//			isEquals = false;
//			return;
//		}
//		for(int i = 0; i < arr1.length; i++) {
//			for(int j = 0; j < arr1[0].length; j++) {
//				if(arr1[i][j] != arr2[i][j]) {
//					isEquals = false;
//					break;
//				}
//			}
//		}
//		System.out.println(isEquals ? "동일합니다" : " 동일하지 않습니다");
//		
//		// Q6. 두 배열의 덧셈결과 저장하는 배열 (addArr)
//		int[][] addArr = new int[arr1.length][arr1[0].length];
//		for(int i = 0; i < arr1.length; i++) {
//			for(int j = 0; j < arr1[0].length; j++) {
//				addArr[i][j] = arr1[i][j] + arr2[i][j];
//				}
//			}
//		
//		// Q7. 두 배열의 뺄셈결과 저장하는 배열 (subArr)
//		int[][] subArr = new int[arr1.length][arr1[0].length];
//		for(int i = 0; i < arr1.length; i++) {
//			for(int j = 0; j < arr1[0].length; j++) {
//				subArr[i][j] = arr1[i][j] - arr2[i][j];
//				}
//			}
//		// 이차원 배열 형태에 맞게 출력
//		for (int i = 0; i < addArr.length; i++) {
//			for (int j = 0; j < addArr[0].length; j++) {
//				System.out.print(addArr[i][j] + " ");
//				if (j == addArr[0].length - 1) {
//					System.out.println();
//				}
//			}
//		}
//		for (int i = 0; i < subArr.length; i++) {
//			for (int j = 0; j < subArr[0].length; j++) {
//				System.out.print(subArr[i][j] + " ");
//				if (j == subArr[0].length - 1) {
//					System.out.println();
//				}
//			}
//		}
		
		// Q8. 사용자에게 행의 길이, 열의 길이를 입력받아 다음과 같은 1차원 배열을 2차원 배열로 바꿔보세요!
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[] arr1d = new int[row * col];
		int[][] arr2d = new int[row][col];
		for (int i = 0; i < arr1d.length; i++) {
			arr1d[i] = i * 10;
		}
		for (int i = 0; i < arr2d.length; i++) {
			for (int j = 0; j < arr2d[0].length; j++) {
				arr2d[i][j] = arr1d[i * col + j];
			}
		}
		for (int i = 0; i < arr2d.length; i++) {
			for (int j = 0; j < arr2d[0].length; j++) {
				System.out.println(arr2d[i][j]);
			}
		}
		
	}

}

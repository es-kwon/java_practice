package object_array;

import java.util.Scanner;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// 객체 배열 : 배열의 원소가 객체인 배열
//		Employee e1 = new Employee();
//		Employee e2 = new Employee();
//		Employee e3 = new Employee();
		
		// 배열 생성
		Employee[] empArr = new Employee[3];
		
		// 배열 원소 (객체) 생성
		for(int i = 0; i < empArr.length; i++) {
			empArr[i] = new Employee(i + 1);
		}
		
		// 객체 배열의 원소를 초기화
		for(int i = 0; i < empArr.length; i++) {
			System.out.printf("[사원번호 : %d]의 이름, 직책, 부서를 입력 : ", 
					empArr[i].getEno());
					empArr[i].setName(sc.next());
					empArr[i].setPosition(sc.next());
					empArr[i].setDepart(sc.next());
		}
		
		EmpGroup empGroup = new EmpGroup(empArr);
		
		while (true) {
			System.out.println("1. 사원 정보 출력");
			System.out.println("2. 직책으로 검색");
			System.out.println("3. 부서로 검색");
			System.out.println("4. 종료");
			System.out.print("메뉴 선택 : ");
			int choice = sc.nextInt();

			if (choice == 1) {
				// Q1. 객체 배열의 원소 (사원)의 정보를 출력 -> displayEmployee()
				empGroup.displayEmployee();
			} 
			else if (choice == 2) {
				// Q2. 사용자한테 직책을 입력받아 해당 직책의 사원정보를 출력 -> searchEmployeebyPosition()
				System.out.print("검색할 직책 : ");
				String userInputPosition = sc.next();
				EmpGroup searchbyPosition = new EmpGroup(empGroup.searchEmployeebyPosition(userInputPosition));
				searchbyPosition.displayEmployee();
			} 
			else if (choice == 3) {
				// Q3. 사용자한테 부서를 입력받아 해당 부서의 사원정보를 출력 -> searchEmployeebyDepart()
				System.out.print("검색할 부서 : ");
				String userInputDepart = sc.next();
				EmpGroup searchbyDepart = new EmpGroup(empGroup.searchEmployeebyDepart(userInputDepart));
				searchbyDepart.displayEmployee();
			}

			else if (choice == 4) {
				System.out.println("프로그램 종료...");
				break;
			}
		}
	}
	
//	public static void displayEmployee(Employee[] empGroup) {
//		for (int i = 0; i < empGroup.length; i++) {
//			System.out.println(empGroup[i]);
//		}
//	}
//	
//	public static Employee[] searchEmployeebyPosition(Employee[] empGroup, String userInputPosition) {
//		int count = 0;
//		for(int i = 0; i < empGroup.length; i++) {
//			if(empGroup[i].getPosition().equals(userInputPosition)) {
//				count++;
//			}
//		}
//		Employee[] arraybyPosition = new Employee[count];
//		int index = 0;
//		for(int i = 0; i < empGroup.length; i++) {
//			if(empGroup[i].getPosition().equals(userInputPosition)) {
//				arraybyPosition[index] = empGroup[i];
//				index++;
//			}
//		}
//		return arraybyPosition;
//	}
//	
//	public static Employee[] searchEmployeebyDepart(Employee[] empGroup, String userInputDepart) {
//		int count = 0;
//		for(int i = 0; i < empGroup.length; i++) {
//			if(empGroup[i].getDepart().equals(userInputDepart)) {
//				count++;
//			}
//		}
//		Employee[] arraybyDepart = new Employee[count];
//		int index = 0;
//		for(int i = 0; i < empGroup.length; i++) {
//			if(empGroup[i].getDepart().equals(userInputDepart)) {
//				arraybyDepart[index] = empGroup[i];
//				index++;
//			}
//		}
//		return arraybyDepart;
//	}
	
	
	

}

package oop;

public class OOPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 객체지향 프로그래밍 (Object-Oriented Programming
		 * 
		 * 클래스 : 데이터 (필드, 멤버변수) + 함수 (메서드)
		 * ex) 자동차 공장
		 * 클래스 : 자동차 설계도
		 * 객체 : 자동차 (실제 행동하고 실존하는 단위)
		 * 
		 * 객체지향 3대 특징
		 * 1) 캡슐화 (encapsulation, 정보 은닉)
		 * + setter (반환형 void), getter (반환형 존재)
		 *  set필드이름, get필드이름 (*필드이름의 첫 문자는 대문자)
		 *  
		 * 			- 접근 제어자
		 * 			a) public : 모든 클래스 접근 가능
		 * 			b) protected : 상속관계 접근 가능
		 * 			c) private : 동일 클래스에서만 접근 가능
		 * 
		 * 2) 상속 (inheritance)
		 * 3) 다형성 (polymorphism)
		 * */
		
		// 클래스도 하나의 데이터 타입
		Parson p1 = new Parson(); // 객체 만듦
		p1.setName("홍길동");
//		System.out.println(p1.age);
		p1.setAge(-1);
//		System.out.println(p1.age);
		System.out.println(p1.getAge());

		
		// addAge 함수를 통해 3년 후의 홍길동 나이는?
		p1.addAge(3);
		p1.changeName("홍길길");
		
		p1.setEmail("qwer@email.com");
		p1.changeEmail("asdf@email.com");
		
		System.out.println(p1); // 참조 변수
		
		Parson p2 = new Parson();
		p2.setName("홍길순");
		
		Parson manager = new Parson();
		Parson employee = new Parson();
		
		// 1) manager, employee 이름, 나이, 직책을 설정하시오
		manager.setName("김매니저");
		manager.setAge(35);
		manager.setPosition("manager");
		
		employee.setName("박파트타임");
		employee.setAge(20);
		employee.setPosition("part-time");
		
		// 2)
		int age = employee.getAge();
		System.out.println(age); // 20
		
//		System.out.println(employee.getAge());
		employee.setAge(-100); 
		// setAge() 함수 내에 있는 유효성검사에서 탈락! (-100은 양수가 아니기 때문)
		
		age = employee.getAge();
		System.out.println(age); // 20
		
		// 3)
		Parson employee2 = new Parson();
		employee2.setName("박파트타임");
		
		System.out.println(employee == employee2);
		// 주소값 비교(new를 통해 새로운 주소를 할당 -> false)
		
		// 이름이 동일한지 확인
		System.out.println(employee.getName().equals(employee2.getName()));
		
		
		// 4) manager의 성별, 이메일을 설정
		manager.setGender("male");
		manager.setEmail("manager@email.com");
		
		String gender = manager.getGender();
		System.out.println(gender);
		String email = manager.getEmail();
		System.out.println(email);
		
		// 5) employee의 성별, 이메일을 설정
		employee.setGender("male");
		employee.setEmail("employee@email.com");
		
		gender = employee.getGender();
		System.out.println(gender);
		System.out.println(employee.getEmail());
		
		// 6) 성별 (male, female)이 아닌 다른 성별이 들어올 경우 에러 출력
		manager.setGender("feemale");
		gender = manager.getGender();
		System.out.println(gender);

		// 7) 이메일 @가 없는 이상한 이메일이 들어올경우 에러 출력
		manager.setEmail("manager@@email.com");
		email = manager.getEmail();
		System.out.println(email);
		employee.setEmail("employee$email.com");
		email = employee.getEmail();
		System.out.println(email);

	}

}

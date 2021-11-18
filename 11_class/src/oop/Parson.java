package oop;

public class Parson {
	// 필드
	// private
	private String name;
	private int age;
	private String regNum; // 주민등록번호
	private String gender; // 성별
	private String email;
	private String position;
	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	// 함수 (데이터 기능/동작)	
	// public
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getRegNum() {
		return regNum;
	}

	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if(gender.equals("male") || gender.equals("female")) {
			this.gender = gender;
		}
		else {
			System.out.println("[경고] 유효하지 않은 데이터 입니다");
		}
	}

	public String getEmail() {
		return email;
	}

	public void setAge(int age) {
		if(age > 0) { // 데이터 유효성 검사
			this.age = age;
		}
		else {
			System.out.println("[경고] 유효하지 않은 데이터 입니다");
		}
	}
	
	public int getAge() {
		return this.age;
	}
	
 	public void setEmail(String email) {
// 		int count = 0;
//		for(int i = 0; i < email.length(); i++) {
//			if(email.charAt(i) == '@') {
//				count++;
//			}
//		}
//		if(count == 1) {
//			this.email = email;
//		}
//		else {
//			System.out.println("[경고] 유효하지 않은 데이터 입니다");
//		}
 		if (email.indexOf('@') == -1) {
 			System.out.println("[경고] 유효하지 않은 데이터 입니다");
 		}
 		else { // 처음 만난 @의 인덱스 값 반환
 			this.email = email;
 		}
	}
	
	public void addAge(int passedYear) {
		this.age += passedYear;
	}
	
	public void changeName(String name) {
		this.name = name;
		// 필드 이름과 매개변수 이름이 동일한 경우
		// 필드 이름 앞에 this.로 구분 가능
	}
	
	public void changeEmail(String email) {
		this.email = email;
	}
	
}

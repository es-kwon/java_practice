package aisolution;

public class Custormer {
	// 필드
	private int age;
	private String gender;
	private String location;
	private int spentTime;
	private static int count;
	
	// 생성자
	public Custormer() {
		
	}

	// getter, setter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getSpentTime() {
		return spentTime;
	}

	public void setSpentTime(int spentTime) {
		this.spentTime = spentTime;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Custormer.count = count;
	}
	
	// parameter별 Custormer 객체 배열
	public static Custormer[] idealArr;
	static Custormer[] likelyArr;
	static Custormer[] defectArr;
	static Custormer[] othersArr;
	
	
	
	//
//	public void checkGroup() {
//		if(this.age >= )
//	}
//	
	
	

}

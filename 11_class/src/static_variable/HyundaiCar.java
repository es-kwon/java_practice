package static_variable;

public class HyundaiCar {

	// 클래스 변수 (static 변수)
	// 모든 객체가 공유하는 변수
	private static String model = "hyundai";

	// static 변수를 많이 쓰는 예제
	public static int count = 0; // 객체 수 카운트

	// 필드
	private String id;
	private String color;
	private int price;

	// 생성자 (constructor, 객체를 생성할때 호출하는 함수)
	// 접근 제어자 + 클래스 이름 (반환값이 없음)
	// 만약 생성자가 아무것도 정의되어있지 않으면
	// 빈생성자 (디폴트 생성자)는 자동 생성
	// 만약 생성자가 하나라도 정의되어있으면
	// 빈생성자 (디폴트 생성자)는 자동 생성 X
	// -> 직접 디폴트 생성자를 생성해줘야 함
	public HyundaiCar() { // 빈 생성자 (디폴트 생성자)
//		this.id = null;
//		this.color = null;
//		this.price = 0;
		count++; // 객체 수를 카운트하는 변수
	}

	public HyundaiCar(String id) {
		this.id = id;
//		this.model = null;
//		this.color = null;
//		this.price = 0;
		count++;
	}

	public HyundaiCar(String id, 
			String color, 
			int price) {
		this.id = id;
		this.color = color;
		this.price = price;
		count++;
	}

	// 함수 (기능/동작)
	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

//	public  void setModel(String model) {
//		this.model = model;
//	}
//	

	// static 변수를 접근하는 함수도
	// static으로 정의
	public static String getModel() {
		return model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void setPrice(int price) {
		if (price > 0) {
			this.price = price;
		} 
		else {
			System.out.println("[경고] 유효하지 않은 값입니다");
		}
	}

	public int getPrice() {
		return this.price;
	}

	@Override // 어노테이션 (인용), toString()의 오타를 잡아줌
	public String toString() {
		return String.format("id : %s, model : %s, color : %s, price : %d", id, model, color, price);
	}

	@Override
	public boolean equals(Object c) {
		if (this.id.equals(((HyundaiCar) c).id) &&
//				this.model.equals(((HyundaiCar)c).model) &&
				this.color.equals(((HyundaiCar) c).color) && this.price == ((HyundaiCar) c).price) {
			return true;
		} 
		else {
			return false;
		}
	}

}

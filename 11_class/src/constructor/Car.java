package constructor;

public class Car {
	// 필드
	private String id;
	private String model;
	private String color;
	private int price;
	
	// 생성자 (constructor, 객체를 생성할때 호출하는 함수)
	// 접근 제어자 + 클래스 이름 (반환값이 없음)
	// 만약 생성자가 아무것도 정의되어있지 않으면 
	// 빈생성자 (디폴트 생성자)는 자동 생성
	// 만약 생성자가 하나라도 정의되어있으면
	// 빈생성자 (디폴트 생성자)는 자동 생성 X
	// -> 직접 디폴트 생성자를 생성해줘야 함
	public Car() { // 빈 생성자 (디폴트 생성자)
		this.id = null;
		this.model = null;
		this.color = null;
		this.price = 0;
	}
	public Car(String id) {
		this.id = id;
//		this.model = null;
//		this.color = null;
//		this.price = 0;
	}
	public Car(String id, String model) {
		this.id = id;
		this.model = model;
//		this.color = null;
//		this.price = 0;
	}
	public Car(String id
			, String model
			, String color
			, int price) {
		this.id = id;
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
	// 함수 (기능/동작)
	public void setId(String id){
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setPrice(int price) {
		if(price > 0) {
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
		return String.format
				("id : %s, model : %s, color : %s, price : %d", 
						id, model, color, price);
	}
	
	@Override
	public boolean equals(Object c) {
		if (this.id.equals(((Car)c).id) &&
				this.model.equals(((Car)c).model) &&
				this.color.equals(((Car)c).color) &&
				this.price == ((Car)c).price){
			return true;
		}
		else {
			return false;
		}
	}
	
}

package constructor;

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Q1. Car
		// String id (일련번호)
		// String model (모델이름)
		// String color (색상)
		// int price (가격) (음수가 될 수 없음)
		
		Car car1 = new Car();
		Car car2 = new Car();
		System.out.println(car1);
		System.out.println(car2);
		
		car1.setId("WDD2120011A021123");
		car1.setModel("E220 Blutec");
		car1.setColor("Red");
		car1.setPrice(5000);
		
//		car2.setId("WDD2220331A021142");
//		car2.setModel("S350 Blutec 4Matic");
//		car2.setColor("Black");
//		car2.setPrice(13000);
		car2.setId("WDD2120011A021123");
		car2.setModel("E220 Blutec");
		car2.setColor("Red");
		car2.setPrice(5000);
		
		// 참조형 변수를 출력할 때 주소값이 아니라
		// 필드값이 출력되고 싶다면?
		// toString을 정의하면 된다!
		System.out.println(car1);
		System.out.println(car2);
		
		System.out.println(car1.equals(car2));
		
		// 1. 함수명 동일
		// 2. 매개변수 타입, 순서, 개수
		// ex) 순서
		// String, String, int != int, String, String
		
		Car car3 = new Car("WDD2130031A232402");
		System.out.println(car3);
		
		Car car4 = new Car("WDD2130031A232403", "E300");
		System.out.println(car4);
		
		Car car5 = new Car("WDD2130031A232404", "E300", "Red", 5000);
		System.out.println(car5);
		
		car5.setColor("Black");
		System.out.println(car5);
	}
}

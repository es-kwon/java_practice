package overview;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape();
		s.draw();
		
		Rectangle r = new Rectangle();
		r.draw(); // 자식 클래스에서 재정의된 메소드 호출
		
		/* 다형성
		 * : 데이터 형을 다양하게 할 수 있는 성질
		 * 
		 * ex) 생성자
		 * 생성자 (int x, int y)
		 * 생성자 (double x, double y)
		 * 
		 * */
		
		Shape s2 = new Rectangle();
		// s2 : p (o)
		System.out.println(s2.getP());
//		System.out.println(s2.p);
		// protected (상속 관계, 패키지 동일할 때 접근 가능)
		System.out.println(((Rectangle)s2).getWl());
		System.out.println(((Rectangle)s2).getHl());
		// 부모 변수에서 자식 클래스에만 있는 필드를 접근할 때
		// 명시적인 형변환 (type casting)을 통해 접근할 수 있음
		
		s2 = new Circle();
		s2 = new Triangle();
		// 부모가 만들어놓은 틀(변수)에 자식 객체가 할당 될 수 있음
		
//		Rectangle r2 = new Shape();
		// 반대는 안된다 ... ! (구현상의 이유로 막아둠)
		// r2 : p, width (x), height (x)

	}

}

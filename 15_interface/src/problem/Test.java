package problem;

public class Test {

	public static void main(String[] args) {
		GraphicControl[] gc = new GraphicControl[3];
		gc[0] = new Triangle(3, 5, 4, 6);
		gc[1] = new Rectangle(10, 20, 4, 6);
		gc[2] = new Circle(50, 60, 3);
		// Triangle, Rectangle, Circle 클래스는
		// GraphicControl 인터페이스를 구현하고 있음
		// => GraphicControl 객체변수 = new 구현 클래스();
		
		for(int i = 0; i < gc.length; i++) {
			System.out.println(gc[i]);
		}
		System.out.println();
		
		////////////////////////////////////////////////////////////////////////
		// Q1. Triangle의 중점을 (1, 2) 만큼 이동
		// Q2. Triangle, Rectangle, Circle의 현재 면적 계산
		// Q3. Triangle, Rectangle, Circle의 draw() 호출
		
		// Q1
		((Triangle)gc[0]).getP().moveOriginal(1, 2);
		// protected : 자식 클래스 / 같은 package 공개
		System.out.println(gc[0]); // 중점 이동이 잘 되었는지 확인
		
		System.out.println(((Triangle)gc[0]).getBl()); // private
		System.out.println(((Triangle)gc[0]).getHl()); // private
		
		// Q1 - 1. Rectangle의 중점을 (1, 2)만큼 이동
		// Q1 - 2. Circle의 중점을 (1, 2)만큼 이동
		
		for(int i = 0; i < gc.length; i++) {
			((Shape)gc[i]).getP().moveOriginal(1, 2);
			System.out.println(gc[i]);
		}
		System.out.println();
		
		// Q2
		for(int i = 0; i < gc.length; i++) {
			System.out.println(gc[i].calcArea() + "cm^2");
		}
		
		// Q3
		for(int i = 0; i < gc.length; i++) {
			gc[i].draw();
		}
		
		
	}

}

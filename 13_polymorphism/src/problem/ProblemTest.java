package problem;

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends C {
}

public class ProblemTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      // 왜 오류가 나는지 생각해보세요!
      
	   // A가 B, C, D, E의 부모클래스 이기 때문에 자식 클래스를 포함할 수 있음
	   // 다형성 개념
	   
	   A a1;
      a1 = new B();
      a1 = new C();
      a1 = new D();
      a1 = new E();

      B b1;
      b1 = new A(); // A는 B의 부모
      b1 = new C(); // B와 C는 A의 자식
      b1 = new D();
      // B는 D의 부모 클래스이기 때문에
      b1 = new E(); // B와 E는 관계 없음

      C c1;
      c1 = new A(); // A는 C의 부모
      c1 = new B(); // B와 C는 A의 자식
      c1 = new D(); // C와 D는 관계 없음
      c1 = new E();

      D d1;
      d1 = new A(); // A는 B의 부모, B는 D의 부모
      d1 = new B(); // B는 D의 부모
      d1 = new C(); // D는 C와 관계 없음
      d1 = new E(); // D는 E와 관계 없음

      E e1;
      e1 = new A(); // A는 C의 부모, C는 E의 부모
      e1 = new B(); // D는 E와 관계 없음
      e1 = new C(); // C는 E의 부모
      e1 = new D(); // E는 D와 관계 없음
   }

}

package variables;

public class VariablesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 상수 (constant)
		// : 변할 수 없는 데이터를 저장하는 공간
		// : final로 정의
		// : 상수 이름은 모두 대문자로 작성
		
		final double PI = 3.14f; // 3.14라는 데이터가 final(마지막, 최종) 데이터이기 때문에 변할 수 없음
		// 1) 큰 공간(double)에 작은 데이터(float)이 들어가는것은 가능함
		// 2) 실제론 3.14f -> 3.14 데이터 타입이 변경 (자동 형변환) 되어 들어간다

		final float PI1 = (float)3.14;
		// 작은 공간(float)에 큰 데이터(double)이 들어가는것은 불가능함
		// 명시적 형변환 해주고 들어감!
		
		System.out.println((int)PI); // 3 (소수점 뒤 부분은 버리고 정수부분만 출력)
		
		// Q1. '7' -> 7로 변경할 수 없을까요?
		char num = '7';
		int numInt = (int)num - (int)'0'; // '7 -> 7
		// (int)num == 55, (int)'0' == 48, 55 - 48 == 7
		System.out.println(numInt);
		
		System.out.println((int)'7'); // 55 -> 7
//		System.out.println((int)"7");
				
		
//		PI = 3.141592; // 상수는 수정 불가능
		
		final double PI2;
		PI2 = 3.15;
		// 이 방법이 가능은 하지만, 상수는 선언할 때 데이터를 넣는것이 좋다
		
		int k = 10;
		k = 20;
		
		/* 변수 (variavles)
		 * : 변할 수 있는 데이터를 저장하는 공간 (상자)
		 * : 변수의 타입 (데이터 타입, 자료형)
		 * 1) 정수 (1, 2, 3, ...) (integer, int)
		 * 2) 실수 (1.23, 3.14, 5.12) (float, double)
		 *   : ex) 1.234567892123 -> 소수점 아래가 길면 double (데이터 자료가 더 큰)
		 *   : ex) 1.2345 -> 소수점 아래가 짧으면 float (데이터 자료가 작은)
		 *   : float 보다 double이 더 큰 저장공간을 차지함 (모두 double을 사용하지 않는 이유)
		 *   : 실수의 기본타입은 double
		 * 3) 문자 ('a', 'b', 'c') (character, char)
		 *   : 작은 따옴표 (')로 정의
		 * 4) 문자열 ("abc", "hello") (String)
		 *   : 큰 따옴표 (")로 정의
		 *   : String은 기초 데이터 자료가 아니고 class다
		 * 5) 불린 (true, flase) (boolean, bool)
		 *   : ex) 1이 1과 같니? (true)
		 *   
		 * : 변수의 이름 (명명 규칙)
		 * 1) 영어로 작성 (a와 A는 다름, 대소문자 구분)
		 * 2) 의미있게 작성
		 * 	 : ex) name, height, age, count
		 * 3) 첫 문자가 숫자이면 안됨
		 *   : ex) name1 (O), name2 (O)
		 *   : ex) 1name (x), 2name (x)
		 *   : 숫자와 변수를 구분해주기 위해
		 *   : why? 1 vs a vs 'a' vs "a"
		 *   
		 * 4) 특수기호 : _ (****), $ 만 허용 (띄어쓰기도 안됨)
		 * 5) 변수의 이름은 소문자 시작 (countScore)
		 *   : 만약 복합어인 경우 복합어의 첫 문자는 대문자
		 * 6) 키워드 (keyword)를 변수이름으로 사용할 수 없음
		 *   : ex) class, public, main, package
		 * */
		
		// 대입연사자를 (=)를 통해 데이터를 대입!
		// 컴퓨터에서 같다는 어떻게 표현할까요? (==)
		// 변수 = 데이터 (리터럴, literal) (오른쪽에 있는 데이터를 왼쪽 변수에 넣는다)
		// 3.14 (double) 소수점이 들어가는 데이터는 기본값이 double
		// 3 (int)
		
		int x = 3;
		// int x;
		// x = 3;
		
//		int x; // 중복된 변수 이름 사용 불가 
		System.out.println(x);
		
		// 3.141231231241241231 (double)
		// why? double이 float보다 더 많은 데이터를 담을 수 있어서 데이터를 잃지 않기 위해 double이 기본형
		
		float y = 3.14f;
		// double 뒤에 f를 붙이면 float이 됨
		float yy = (float)3.14;
		// double -> float 형변환
		double z = 3.141235123;
		char ch = 'a';
		String s = "abcd";
		// Sstring은 키워드가 아님, 대문자로 시작 
		// 자바에서 정의한 기초 자료형이 아님 (클래스)
		boolean checker = true;
		System.out.println(checker);
		
		// Q1. 본인의 이름을 저장하는 변수를 만들고, 이름을 저장해보자!
		String name = "권영재";
		
		// Q2. 본인의 나이를 저장하는 변수를 만들고, 나이를 저장해보자!
		int age = 29;
		
		// Q3. 내년 본인의 나이를 저장하는 변수를 만들고 내년 본인의 나이를 저장해보자!
		int nextAge = age + 1;
		
		// Q4. 현재 나이와 내년의 나이가 같은지를 확인
		
//		checker = (age == nextAge); // 기존의 checker가 업데이트
//		System.out.println(checker);
		
		
		boolean checker2 = (age == nextAge);
		// checker는 그대로 유지된 채로 checker2가 생성
		System.out.println(checker); // true
		System.out.println(checker2); // false
		
		// 동일한 변수 이름이 위에 선언이 되어있기 때문에 오류가 난다
		// 하나의 프로그램 안에서는 중복된 변수를 할당할 수 없음
		int a;
		a = 3;
		System.out.println(a);
		a = 5;
		System.out.println(a);
		System.out.println("a");
		// a vs "a" vs 'a'
		// a : 변수 -- 1)
		// "a" : 문자열 데이터 -- 2)
		// 'a' : 문자 데이터 -- 3)
		
		// 1 vs "1" vs '1'
		// 1 : 정수 데이터 -- 4)
		// "1" : 문자열 데이터 -- 5)
		// '1' : 문자 데이터 -- 6)
		
		// 변수 = 데이터
		// Q1. 왼쪽 변수 자리에 올 수 있는 친구는 1 ~ 6 중 누구?
		// -- 1번 가능
		// Q2. 오른쪽 자리에 올 수 없는 친구는 1 ~ 6 중 누구?
		// -- 1번 불가능? 다 올 수 있음
		int c = 10;
		int d = c; // d : 10
		// 변수가 오른쪽에 오게되는 경우는 그 변수에 데이터가 사전에 정의되어 있어야 함
		// 만약 변수에 들어가있는 데이터가 없거나 정의되지 않았으면 오류가 난다
		
//		int a; // 불가능
		
		
		// boolean checker = (age == nextAge); 는 다음 두 줄과 동일
		// boolean checker;
		// checker = (age == nextAge);
		
		
	}

}

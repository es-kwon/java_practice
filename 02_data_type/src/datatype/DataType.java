package datatype;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 데이터 타입 (자료형)
		/*
		 * 정수 : byte (1byte), short (2byte), int (4byte), long (8byte) (순서가 데이터 사이즈)
		 * 실수 : float (4byte), double (8byte)
		 * 문자 : char (2byte)
		 * 문자열 : String
		 * 불린 : boolean (1byte)
		 * 
		 * */
		
		// Q1.
//		byte b = 128; // byte 의 범위는 -128 ~ 127 이어서 128은 불포함
		// overflow가 나서 오류가 남! (반대는 underflow)
		float f = 3e6f; // 3x10^6, 3e6은 double 이므로 float 변수에 할당 불가
		// 3e6 == 3E6 (소문자로 쓰기도 하고 대문자로 쓰기도 함)
		// 컴퓨터에서 소수점의 위치와 상관없이 가수와 지수로 표기하는 방식을
		// floating point (부동소수점) 방식이라고 함
		double d = 3e6; 
		double dd = 3e-6; // 3x10^(-6)
		System.out.println(d);
		System.out.println(dd);
		
		// Q2. 아래의 코드에서 float ff가 왜 정확하지 않은지 설명하시오.
		// float은 정확한 표현이 안되기 때문에 웬만하면 double을 사용하자
		float ff = 312.25789012f;
		double ddd = 312.25789012;
		System.out.println(ff);
		System.out.printf("%.8f\n", ff);
		// 소수점 밑에 6자리까지만 출력
		// 8자리까지 출력하면 쓰레기값이 포함됨
		System.out.println(ddd);
		System.out.printf("%.8f\n", ddd);
		// 소수점 밑에 6자리까지만 출력
		
		// 더블로 표현하지 못하는 수에 대해서는 어떻게 표현할까요?
		// "" (String)
		
		// 정수 : 10진수 (사람), 2진수 (컴퓨터),
		// 8진수 (2^3), 16진수 (2^4)
		
		int d1 = 10; // 10진수
		int d2 = 012; // 8진수 => 1*8^1 + 2*8^0 == 10(10)
		// 8진수는 0~~로 표기
		int d3 = 0XA; // 16진수 => 10*16^0
		// 16진수는 0X~로 표기
		
		// %d => decimal (10진법)
		System.out.printf("%d \n", d1);
		System.out.printf("%d \n", d2);
		System.out.printf("%d \n", d3);
		
		// %o => octal (8진법)
		System.out.printf("%o \n", d1);
		System.out.printf("%o \n", d2);
		System.out.printf("%o \n", d3);
		
		// %x => hexa (16진법)
		System.out.printf("%X \n", d1);
		System.out.printf("%X \n", d2);
		System.out.printf("%X \n", d3);
		// x는 소문자 출력, X는 대문자 출력
		
		
	}

}

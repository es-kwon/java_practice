package string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// null 은 참조형 변수를 초기화할때만 사용
//		int a = null; // 일반 기초형 변수 , 오류
		int[] arr = null;
		String str = null; // 힙 메모리 공간이 아직 정해져있지 않음 (String 변수 초기화)
		
		// 문자열 정의 방법
		int[] arr1 = {10, 20, 30};
		char[] arr2 = {'c', 'h', 'o'};
		String str1 = "hello"; // 힙 메모리 안에 있는 string pool의 동일한 데이터의 주소를 가리킴
		String str3 = "hello"; // 힙 메모리 안에 있는 string pool의 동일한 데이터의 주소를 가리킴
		System.out.println(str1 == str3); // == 은 주소값이 동일한지 확인
		System.out.println(str1.equals(str3)); // 데이터값이 동일한지 확인
		System.out.println(str1.toString()); // 참조형 변수, 데이터를 출력하기 위해서 toString()
		System.out.println(arr1); // 참조형 변수, 주소값
		System.out.println(arr2); // 참조형 변수, 데이터를 출력하기 위해서 toString()
		System.out.println();
		
		String str2 = new String("hello");
		String str4 = new String("hello");
		System.out.println(str2 == str4); // 주소값이 동일한지 확인
		System.out.println(str2.equals(str4)); // 데이터값이 동일한지 확인
		System.out.println(str2);
		
		// char[] vs String
		char[] str5 = {'h', 'e', 'l', 'l', 'o'}; // 일부만 수정 가능
		String str6 = "hello"; // 문자열 상수 (일부만 수정 불가능)
		
		str5[0] = 'H'; // 가능
//		str6.charAt(0) = 'H'; // 불가능
		str6 = "Hello"; // 일부만 수정이 불가능해서 다시 데이터 대입
		
		// 문자열 (String) 클래스 안에
		str6 = "hhhhh";
		String str7 = str6.replace('h', 'H'); // String (str6) -> char[] -> 'h' -> 'H' -> String (str7)
		System.out.println(str6); // 원본 수정이 아니고
		System.out.println(str7); // 새로운 String이 생김
		
		// 일부 문자 반환
		str6 = "hello";
		System.out.println(str6.charAt(0));
		
		// 문자열 길이 반환
		System.out.println(str6.length());
		
		// 문자열 + 문자열 : 문자열 결합
		System.out.println("h" + "ello");
		
		// 문자열 결합 concat (concatenation)
		System.out.println("h".concat("ello"));
		
		// 문자열 내의 일부 문자(열) 반환
		str6 = "hello"; // 문자열의 길이 : 5, 인덱스 : 0 ~ 4
		String str8 = str6.substring(1, 4); // 시작 인덱스는 포함, 끝 인덱스는 미포함 (1 ~ 3)
		System.out.println(str8);
		
		// "ello"
		str8 = str6.substring(1, str6.length()); // 1 ~ 4
		System.out.println(str8);
		
		// 대문자 변환
		String str9 = str6.toUpperCase();
		
		// 소문자 변환
		String str10 = str6.toLowerCase();
		
		// 대소문자 구분 없이 문자열 비교
		String str11 = "HeLLo";
		String str12 = "hello";
		System.out.println(str11.equalsIgnoreCase(str12)); // true ("h", "H" 가 같음)
		System.out.println(str11.equals(str12)); // false ("h", "H" 가 다름)
		
		// 문자열의 길이가 0인지 확인
		String str13 = "";
		System.out.println(str13.isEmpty()); // true
		
		// 문자열이 비어있거나 공백문자(whitespace : enter, space, tab)인지 확인
		String str14 = "			\t\t\t\t\t\t\t\n"; // \t는 tab만큼 띄운다
		System.out.println(str14.isBlank()); // true
		
		// 문자열 사전식 비교
		// s1이 s2보다 앞에 있으면  < 0, ex) -1
		// s1이 s2와 같으면 0
		// s1이 s2보다 뒤에 있으면 > 0, ex) 1
		// s1.compareTo(s2)
		System.out.println("a".compareTo("aa")); // 'a' 'aa' 사전식 비교 -1
	    System.out.println("a".compareTo("ca")); // 'a' - 'c' : -2
	    System.out.println("a".compareTo("ab")); // 'a' 'ab' 사전식 비교 -1
	    System.out.println("a".compareTo("A")); // 'a' - 'A' : 32
	    System.out.println("A".compareTo("a")); // 'A' - 'a' : -32
	    System.out.println("a".compareTo("b")); // 'a' - 'b' : -1
	    System.out.println("a".compareTo("a")); // 'a' - 'a' : 0
	    System.out.println("BB".compareTo("B")); // 'BB' 'B' : 사전식 비교 1
	    System.out.println("a".compareTo("C")); // 'a' - 'C' : 30
	    
	    // 문자열 -> 정수 (Integer.parseInt(문자열))
	    // 문자열 -> 실수 (Double.parseDouble(문자열))
	    // 기초 자료형 : int, double, float .... (함수를 포함할 수 없음)
	    // 랩퍼 클래스 : Integer, Double, Float, Character, Boolean
	    // 랩퍼 클래스 (wrapper class) : 기초 자료형들을 감싸고 있는 클래스
	    // why? 기초 자료형은 함수를 포함 할 수 없기때문에 필요한 함수를 정의하기 위해 만듦
	    
	    String s1 = "1234";
	    int s1_int = Integer.parseInt(s1);
	    
	    String s2 = "12.34";
	    double s2_double = Double.parseDouble(s2);
	    
	    
	    
		
	    
		
		
	}

}

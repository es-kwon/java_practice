package print;

public class Test {
	
	public int sum (int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test myTest = new Test();
		
		int x = 3;
		int y = 4;
		
		int c = myTest.sum(x, y);
		
		System.out.println(c);
	}

}

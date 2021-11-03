package print;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		
		int mch = m - 45;
		
		if ((m - 45) < 0) {
			if ((h - 1) < 0) {
				h = 24 - 1;
				m = 60 + m - 45;
				System.out.println(h + " " + m);
			}
			else {
				h = h - 1;
				m = 60 + m - 45;
				System.out.println(h + " " + m);
			}
		}
		else {
			m = m - 45;
			System.out.println(h + " " + m);
		}
		
	}
}
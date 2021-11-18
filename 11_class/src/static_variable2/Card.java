package static_variable2;

public class Card {
	private String kind; // 무늬 (하트, 스페이드, 다이아몬드, 클로버)
	private String num; // j, q, k, a, 2 ~10
	
	private static final int WIDTH = 100;
	private static final int HEIGHT = 250;
	private static int count = 0;
	
	// 1) 생성자
	// 2) getter, setter
	// 3) toString()
	// 4) equals()
	
	// 생성자
	public Card() {
		
		Card.count++;
	}
	public Card(String kind, String num) {
		this.kind = kind;
		this.num = num;
		Card.count++;
	}
	
	// getter, setter
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		if (kind.equalsIgnoreCase("spade") 
				|| kind.equalsIgnoreCase("heart") 
				|| kind.equalsIgnoreCase("diamond") 
				|| kind.equalsIgnoreCase("clover")) {
			this.kind = kind;
		}
		else {
			System.out.println("[에러] 유효하지 않은 데이터");
		}
	}
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		if (num.length() > 1) {
			if(num.equals("10")) {
				this.num = num;
			}
			else {
				System.out.println("[에러] 유효하지 않은 데이터");
			}
		}
		else {
			if (((num.charAt(0) >= '2') && (num.charAt(0) <= '9'))
					|| (num.toLowerCase().equals("a"))
					|| (num.toLowerCase().equals("j"))
					|| (num.toLowerCase().equals("q"))
					|| (num.toLowerCase().equals("k"))) {
				this.num = num;
			} 
			else {
				System.out.println("[에러] 유효하지 않은 데이터");
			}
		}
		
	}
	
	public static int getCount() {
		return count;
	}
	
	public static int getWidth() {
		return WIDTH;
	}
	
	public static int getHeight() {
		return HEIGHT;
	}
	
	// toString
	@Override
	public String toString() {
		return String.format("kind : %s, num : %s, width : %d, height : %d"
				, kind, num, Card.WIDTH, Card.HEIGHT);
	}
	
	// s1.equals(s2)
	// equals
	@Override // 재정의 (Object 클래스의 함수를 재정의)
	public boolean equals(Object c) {
		if (this.kind.equals(((Card) c).kind)
			&& this.num.equals(((Card) c).num)) {
			return true;
		} 
		else {
			return false;
		}
	}
	
	/* Override (오버라이드, 재정의) : 상위 클래스 (부모 클래스)에 정의 되어있는 함수를 자식 클래스에 맞게 다시 정의
	 * Overload (오버로드, 중복 정의) : 함수 중복 정의 (함수명은 같고 매개변수 순서/개수/타입 다르게 정의)
	 * ex) 생성자 (Card(), Card(String kin, String num))
	 * */
	
	


}

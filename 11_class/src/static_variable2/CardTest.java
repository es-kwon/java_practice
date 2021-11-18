package static_variable2;

public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Card.getCount());
		System.out.println(Card.getWidth());
		System.out.println(Card.getHeight());
		
		Card c1 = new Card();
		Card c2 = new Card("heart", "7");
		int count = Card.getCount();
		
		c1.setKind("heart");
		c1.setNum("7");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1.equals(c2));
		
		System.out.println(count);
		
	}

}

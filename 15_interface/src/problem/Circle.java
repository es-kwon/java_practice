package problem;

public class Circle extends Shape implements GraphicControl {
	private int r;
	private static final double PI = 3.14;
	
	public Circle() {
		super();
		this.r = 0;
	}
	
	public Circle(Point p, int r) {
		super(p);
		this.r = r;
	}
	
	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	@Override
	public void draw() {
		System.out.println("Circle Draw");
	}
	
	@Override
	public boolean equals(Object o) {
		return super.equals(o) && this.r == ((Circle)o).r ;
	}
	
	@Override
	public String toString() {
		return super.toString()+String.format(" ,r : %d", r);
	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return this.r * this.r * PI;
	}
	

}

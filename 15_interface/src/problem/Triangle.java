package problem;

public class Triangle extends Shape implements GraphicControl {

	private int bl; // bottom length
	private int hl; // height length
	
	public Triangle() {
		super(); // 부모 생성자 호출
		this.bl = 0;
		this.hl = 0;
	}
	
	public Triangle(Point p, int bl, int hl) {
		super(p); // 부모 생성자 호출
		this.bl = bl;
		this.hl = hl;
	}
	
	public Triangle(int x, int y, int bl, int hl) {
		super(x, y); // 부모 생성자 호출
		this.bl = bl;
		this.hl = hl;
	}

	public int getBl() {
		return bl;
	}

	public void setBl(int bl) {
		this.bl = bl;
	}

	public int getHl() {
		return hl;
	}

	public void setHl(int hl) {
		this.hl = hl;
	}
	
	@Override
	public void draw() {
		System.out.println("Triangle Draw");
	}
	
	@Override
	public boolean equals(Object o) {
		return super.equals(o) 
				&& this.bl == ((Triangle)o).bl 
				&& this.hl == ((Triangle)o).hl;
	}
	
	@Override
	public String toString() {
		return super.toString()+String.format(" ,bl : %d, hl : %d", bl, hl);
	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return this.bl * this.hl / 2.0;
	}
	
	

}

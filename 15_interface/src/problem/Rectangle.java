package problem;

public class Rectangle extends Shape implements GraphicControl {
	private int wl; // width length
	private int hl; // height length
	
	public Rectangle() {
		super();
		this.wl = 0;
		this.hl = 0;
	}
	
	public Rectangle(Point p, int wl, int hl) {
		super(p);
		this.wl = wl;
		this.hl = hl;
	}
	
	public Rectangle(int x, int y, int wl, int hl) {
		super(x, y);
		this.wl = wl;
		this.hl = hl;
	}

	public int getWl() {
		return wl;
	}

	public void setWl(int wl) {
		this.wl = wl;
	}

	public int getHl() {
		return hl;
	}

	public void setHl(int hl) {
		this.hl = hl;
	}
	
	@Override
	public void draw() {
		System.out.println("Rectangle Draw");
	}
	
	@Override
	public boolean equals(Object o) {
		return super.equals(o) && this.wl == ((Rectangle)o).wl && this.hl == ((Rectangle)o).hl;
	}
	
	@Override
	public String toString() {
		return super.toString()+String.format(" ,wl : %d, hl : %d", wl, hl);
	}
	
	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return this.hl * this.wl;
	}

}

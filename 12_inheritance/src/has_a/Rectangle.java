package has_a;

public class Rectangle {
	
	private Point leftTop;
	private Point rightBottom;
	
	// 생성자
	
	// 객체를 필드로서 포함하고 있는 클래스는
	// 빈 생성자에서 해당 객체를 new 하자!
	public Rectangle() {
		this.leftTop = new Point(0, 0);
		this.rightBottom = new Point(0, 0);
	}
	public Rectangle(Point leftTop, Point rightBottom) {
		this.leftTop = leftTop;
		this.rightBottom = rightBottom;
	}
	public Rectangle(int x1, int y1, int x2, int y2) {
		this.leftTop = new Point(x1, y1);
		this.rightBottom = new Point(x2, y2);
	}
	
	// getter, setter
	public Point getLeftTop() {
		return leftTop;
	}
	public void setLeftTop(Point leftTop) {
		this.leftTop = leftTop;
	}
	public Point getRightBottom() {
		return rightBottom;
	}
	public void setRightBottom(Point rightBottom) {
		this.rightBottom = rightBottom;
	}
	
	// toString
	@Override
	public String toString() {
		return String.format("left top : %s, right bottom : %s", leftTop.toString(), rightBottom.toString());
	}
	
	@Override
	public boolean equals(Object c) {
		return this.leftTop.equals(((Rectangle)c).leftTop) && this.rightBottom.equals(((Rectangle)c).rightBottom);
	}

}

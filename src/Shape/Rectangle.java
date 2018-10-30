package Shape;

public class Rectangle extends Shape implements Comparable<Shape>{
	private int iWidth;
	private int iLength;
	
	public Rectangle(int x, int y) {
		setiWidth(x);
		setiLength(y);
	}
	
	public int getiWidth() {
		return iWidth;
	}
	
	public void setiWidth(int width) {
		this.iWidth = width;
	}
	
	public int getiLength() {
		return iLength;
	}
	
	public void setiLength(int length) {
		this.iLength = length;
	}
	
	public double area() {
		return (iLength * iWidth);
	}
	
	public double perimeter() {
		return (2*iLength + 2*iWidth);
	}
	
	public int compareTo(Shape newRectangle) {
		return this.compareTo(newRectangle);
	}
}

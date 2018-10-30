package Shape;

public class Cuboid extends Rectangle implements Comparable<Shape>{
	private int iDepth;
	
	public Cuboid(int x, int y, int z) {
		super(x, y);
		setiWidth(x);
		setiLength(y);
		setiDepth(z);
	}
	
	public int getiDepth() {
		return iDepth;
	}
	
	public void setiDepth(int depth) {
		this.iDepth = depth;
	}
	
	public double volume() {
		return ((super.getiWidth() * super.getiLength()) * iDepth);
	}
	
	@Override
	public double area() {
		return (2*(super.getiWidth() * super.getiLength()) + 2*(super.getiWidth() * iDepth) + 2*(super.getiLength() * iDepth));
	}
	
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException("Can't do Perimeter for 3D Objects"); 
	}
	
	public int compareTo(Shape newCuboid) {
		return this.compareTo(newCuboid);
	}
	
	class SortByArea {
		public int compare(Cuboid x, Cuboid y) {
			Integer a = (int)x.area();
			Integer b =	(int)y.area();
			return a.compareTo(b);
	}
	
	class SortByVolume {
		public int compare(Cuboid x, Cuboid y)  {
			Integer a = (int)x.volume();
			Integer b =	(int)y.volume();
			return a.compareTo(b);
		}
	}
}
}



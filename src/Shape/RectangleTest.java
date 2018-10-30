package Shape;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

class RectangleTest{
	Rectangle constructorTest = new Rectangle(2,2);
	
	@Test
	public void RectConstructionTest() {
		Rectangle temp = new Rectangle(2,3);
		assertEquals(2,temp.getiWidth());
		assertEquals(3,temp.getiLength());
	}
	
	//test getter
	@Test
	public void getterTest() {
		Rectangle temp = new Rectangle(1,2);
		assertEquals(1,temp.getiWidth());
		assertEquals(2,temp.getiLength());
	}
	//test setter
	@Test
	public void setterTest() {
		Rectangle temp = new Rectangle(1,2);
		temp.setiWidth(5);
		temp.setiLength(6);
		assertEquals(5,temp.getiWidth());
		assertEquals(6,temp.getiLength());
	}
	//test area
	@Test
	public void areaTest() {
		Rectangle temp = new Rectangle(2,3);
		assertEquals(6,temp.area());
	}
	//test perimeter
	@Test
	public void perimeterTest() {
		Rectangle temp = new Rectangle(2,3);
		assertEquals(10,temp.perimeter());
	}
	
	@Test
	public void CompareToTest() {
		Rectangle temp = new Rectangle(1,2);
		Rectangle c2 = new Rectangle(3,2);
		Rectangle c3 = new Rectangle(1,1);
		Rectangle c4 = new Rectangle(1,2);
		assertEquals(-1,temp.compareTo(c2));
		assertEquals(1,temp.compareTo(c3));
		assertEquals(0,temp.compareTo(c4));
	}
	
}

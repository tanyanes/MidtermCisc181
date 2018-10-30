package Shape;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

class CuboidTest{
	Cuboid constructorTestb = new Cuboid(2,2,2);
	
	@Test
	public void CuboidConstructionTest() {
		Cuboid temp = new Cuboid(2,2,2);
		assertEquals(constructorTestb,temp);
		assertEquals(2,temp.getiWidth());
		assertEquals(2,temp.getiLength());
		assertEquals(2,temp.getiDepth());
	}
	
	//test getter
	@Test
	public void getterTestb() {
		Cuboid temp = new Cuboid(1,2,3);
		assertEquals(1,temp.getiWidth());
		assertEquals(2,temp.getiLength());
		assertEquals(3,temp.getiDepth());
	}
	//test setter
	@Test
	public void setterTestb() {
		Cuboid temp = new Cuboid(5,6,7);
		temp.setiWidth(5);
		temp.setiLength(6);
		temp.setiDepth(7);
		assertEquals(5,temp.getiWidth());
		assertEquals(6,temp.getiLength());
		assertEquals(7,temp.getiDepth());
	}
	@Test
	public void AreaTest() {
		Cuboid c1 = new Cuboid(1,2,3);
		assertEquals(22,c1.area());
	}
	@Test
	public void VolumeTest() {
		Cuboid c1 = new Cuboid(1,2,3);
		assertEquals(6,c1.volume());
	}
	
	//to test the perimeter, run this and see console
	//constructorTestb.perimeter();
	
	@Test
	public void SortByAreaTest() {
		Cuboid c1 = new Cuboid(1,2,3);
		Cuboid c2 = new Cuboid(3,2,1);
		Cuboid c3 = new Cuboid(6,6,6);
		Cuboid[] arr = new Cuboid[3];
		arr[0] = c1;
		arr[1] = c2;
		arr[2] = c3;
		ArrayList<Cuboid> cubes = new ArrayList<Cuboid>();
		cubes.add(c3);
		cubes.add(c2);
		cubes.add(c1);
		Collections.sort(cubes, new Cuboid.SortByArea());
		assertArrayEquals(arr,cubes.toArray());
	}
	
	@Test
	public void SortByVolumeTest() {
		Cuboid c1 = new Cuboid(1,1,1);
		Cuboid c2 = new Cuboid(3,2,1);
		Cuboid c3 = new Cuboid(6,6,6);
		Cuboid[] arr = new Cuboid[3];
		arr[0] = c1;
		arr[1] = c2;
		arr[2] = c3;
		ArrayList<Cuboid> cubes = new ArrayList<Cuboid>();
		cubes.add(c3);
		cubes.add(c2);
		cubes.add(c1);
		Collections.sort(cubes, new Cuboid.SortByVolume());
		assertArrayEquals(arr,cubes.toArray());
	}

}

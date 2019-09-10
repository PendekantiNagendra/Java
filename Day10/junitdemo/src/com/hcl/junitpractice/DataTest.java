package com.hcl.junitpractice;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataTest {
	
	@Test
	public void testNullEx() {
		Data obj = null;
		assertEquals(5, obj.sum(2, 3));
	}
	
	@Test
	public void testDiv() {
		Data obj = new Data();
		assertEquals(2, obj.div(5, 2));
	}

@Test(expected = ArithmeticException.class)
public void testDivEx() {
	Data obj = new Data();
	obj.div(5, 0);
}
	
	@Test
	public void testGetPropertyTest() {
		Data objData = new Data();
		assertNotNull(objData.getPropertyTest("Sai"));
		assertNull(objData.getPropertyTest("Prem"));
		
	}
	
	@Test
	public void testEven() {
		Data objData = new Data();
		assertTrue(objData.even(8));
		assertEquals(false,objData.even(13));
	}
	
	@Test
	public void testMinArray() {
		Data objData = new Data();
		int x[] = {1,2,3,0,5};
		assertEquals(0, objData.minArray(x));
	}
	@Test
	public void testMax3(){
		Data objData = new Data();
		assertEquals(5, objData.max3(5, 1, 3));
		assertEquals(5, objData.max3(1, 5, 3));
		assertEquals(5, objData.max3(1, 3, 5));
	}
	@Test
	public void testSum() {
		Data objData = new Data();
		assertEquals(5, objData.sum(2,  3));
		assertEquals(4, objData.sum(1,  3));
	}

	@Test
	public void testSayHello() {
		Data objData = new Data();
		assertEquals("Welcome to Junit", objData.sayHello());
	}

}

package com.junitex;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * Hello world!
 *
 */
public class App{
	
	private static ICalculator calculator;
	
	@BeforeClass
	public static void initCalculator() {
		calculator = new Calculator();
	}
	
	@Before
	 public void beforeEachTest() {
	 System.out.println("This is executed before each Test");
	 }
	
	
	@After
	public void afterEachTest() {
	 System.out.println("This is exceuted after each Test");
	}
	
	@Ignore
	@Test
	public void testSum() {
		int result = calculator.sum(3, 4);
		assertEquals(8, result);
	}
	
	@Test
	 public void testDivison() {
		try {
				int result = calculator.divison(10, 2);
				assertEquals(5, result);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	 }
	
	@Ignore
	@Test
	public void testDivisionException() throws Exception {
		
		calculator.divison(10, 0);
	}
	
	@Ignore
	@Test
	public void testEqual() {
	//System.out.println(this.getName());
	 boolean result = calculator.equalIntegers(20, 20);
	 assertFalse(result);
	   }
	
	@Ignore
	@Test
	public void testSubstraction() {
		int result = 10 - 3;
	     assertTrue(result == 9);
	}
    /*public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }*/
	
	@Test
	public void testBoolean(){
		assertFalse( 6 < 0);
	}
	
	@Test
	public void testEual(){
		assertEquals( 6 , 6);
	}
	
	@Test
	public void testNotNull(){
		int i=0;
		assertNotNull(i);
	}
}

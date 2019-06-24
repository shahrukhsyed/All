package cg;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

class CalculatorTest {
	static Calculator ob;
	
	@BeforeAll ///junit4
	public static void beforeallTest() {
		System.out.println("Before all test");
		ob=new Calculator();
		
	}
	@AfterAll ///junit4
	public static void afterallTest() {
		System.out.println("After all test");
		ob=null;
		
	}
	@RepeatedTest(5)
	void test3() {
		
		
		assertTrue(ob.idgenerator()>0);
		System.out.println(ob.idgenerator());
		
	}
	
	@BeforeEach ///junit4 @Before
	public void beforeEachTest() {
		System.out.println("Before each test");
	//	ob=new Calculator();
	}
	
	@AfterEach
	public void afterEachTest() {
		System.out.println("After each test");
	//	ob=null;
	}
	
	
	@Test
	void testadd() {
		System.out.println("Test case Added");
		
		assertEquals(9, ob.add(4, 5));
	}
	
	
	@Test
	void testadd1() {
		System.out.println("Test case Added");
		
		assertTrue(ob.add(4, -5)>=0);
	}
	
	@Test
	void testadd2() {
		System.out.println("Test case Added");
	
		assertTrue(ob.add(4, -5)>=0);
	}
}

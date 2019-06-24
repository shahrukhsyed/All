package cg;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ValidatorTest {
	@ParameterizedTest
	@ValueSource(strings= {"racecar","radar","naman"})
	void test3(String data) {
		Validator ob=new Validator();
		System.out.println("Test Pallindrome with value "+data);
		assertTrue(ob.isPalindrome(data));
	}
	
	@ParameterizedTest
	@CsvSource({"4,5","10,20"})//automatic conversion
	void test4(int a,int b) {
		Calculator ob=new Calculator();
		System.out.println("test add with values a="+a+" ,b="+b);
		assertTrue(ob.add(a, b)>0);
	}
	@ParameterizedTest
	@MethodSource("testaddwithoutput")
	void withMethodSource(int a,int b,int op) {
		Calculator ob=new Calculator();
		System.out.println("test with add input a="+a+" ,b="+b+" output "+op);
		assertEquals(op, ob.add(a, b));
	}
	
	
	
	private static Stream<Arguments> testaddwithoutput(){
		return Stream.of(
			Arguments.of(4,5,9),
			Arguments.of(10,20,30)
			
				);
	}
	
	
	@ParameterizedTest
	@EnumSource(Size.class)
	void withAllEnumValues(Size size) {
		Validator ob=new Validator();
		System.out.println("Test Enum values "+size);
		assertEquals(size.getMl(), ob.getSizeinMl(size));
	}
	
	
	
	@Test
	void test1() {	
		Validator ob=new Validator();
			String data="100";
			Assumptions.assumeFalse(data!=null);
			Assumptions.assumeTrue(data!=null);
			
		}
	@Test
	void test2() {	
		Validator ob=new Validator();
		//assertTrue(ob.validateNo(null));
		assertThrows(NullPointerException.class,()->ob.validateNo(null) );
		
		}
	
}

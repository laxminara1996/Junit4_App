package in.laxmi.beans.test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import in.laxmi.beans.Calculator;

public class CalculatorTest {
	private static Calculator calc = null;
	
	@BeforeClass
	public static void init() {
		 calc = new Calculator();
	}
	@AfterClass
	public static void destroy() {
		 calc = null;
	}
	@Test
	public void testAdd() {
		Integer actucalResult = calc.add(10, 10);
		Integer expectedResult = 20;
        assertEquals(expectedResult, actucalResult);
	}
	
	@Test
	public void testMultiply() {
		Integer actucalResult = calc.multiply(3, 3);
		Integer expectedResult = 9;
        assertEquals(expectedResult, actucalResult);
	}

}

//junit5 annotatios

//@Test-> used to represent method as a test method
//@BeforeEach->used execute some logic before each test method we can use this
//@AfterEach->used to execute some logic after each test method
//@BeforeAll->before  all test cases execute some logic
//@afterAll-> after all test cases execute some logic
//@ParameterizedTest->want to supply multiple parameters for one method then we can use this annotation
//@ValueSource->to supply multiple inputs for the method
//@CsvSource->supply input from csv format
//@CsvFileSource->form the csv file supply inputs
//MethodSource->one method can give input for the parameter test
//above 4 used for parameterized test annotation
//@Disabled-> skip or stop the required test method execution
//@RepeatedTest->Repeat a test method multiple times
//methods
//assertEquals and assertNotEquals
//assertTrue and assertFalse
//assertNull and assertNotNull
//assertSame and assertNotSame
//assertThrows

// The process of testing to acheive isolation testing use mocking.

//ex: we have communication between service and 
//dao to getting data in this we perform testing only service layer 
//but here dao layer is calling so we use mocking concept.this is also used for testing.
//the process of creating substitute object for the real object is calling mocking
//2 frame works 
//1.stub based mock framework (Easy mock)
//2.ByteCode Manipulation based mock Frameworks(ex:Power mock)


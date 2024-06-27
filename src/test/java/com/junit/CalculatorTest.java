package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import com.junit.pojo.Calculator;

/**
 * @author Naveen K Wodeyar
 * @date 16-07-2024
 * @apiNote test class for Calculator,
 *
 */
//@ExtendWith(SpringExtension.class)
//@SpringBootTest
public class CalculatorTest {
	
	Calculator calculator;
	
	@BeforeAll
	public static void init() {
		System.out.println("Test cases started: "+new Date());
	}
	
	@BeforeEach
	public void beforeTestCase() {
		System.out.println("Before each testCase,"+new Date());}
	
	@AfterEach
	public void afterTestCase() {
		System.out.println("After each testCase,"+new Date());}
	
	@Test
	@DisplayName("Addition test case")
	public void testAdd() {
		calculator = new Calculator();
		assertNotNull(calculator);
		assertEquals(2, calculator.add(1, 1));
	}
	
	@Test
	public void testMultiply() {
		calculator = new Calculator();
		assertEquals(2, calculator.multiply(1, 0));
	}

	@Test
	@Disabled
	public void testDifference() {
		calculator = new Calculator();
		int result = calculator.difference(2, 1);
		assertEquals(0, result,"Test done");
	}
	
	@AfterAll
	public static void cleanUp() {
		System.out.println("Test cases completed: "+new Date());
	}
	
}

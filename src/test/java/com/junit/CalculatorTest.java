package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

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
	
	
	@Test
	public void arrayTest() {
		int arr[] = {1,2,3,4,5};
		int arr2[] = Arrays.copyOf(arr, arr.length);
		Assertions.assertArrayEquals(arr, arr2,"Test case for arrays");
	}
	
	@Test
	public void listTest() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<Integer> list1 = new ArrayList<>(list);
		Assertions.assertIterableEquals(list, list1,"Test case for list");
	}
	
}

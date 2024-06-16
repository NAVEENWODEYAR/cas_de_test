package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
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
	
	@Test
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

}

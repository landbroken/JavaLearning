package com.lyl.JUnit.first;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * 第一个测试用例
 * @author lyl
 *
 */
public class FirstTests {
	private final Calculate cal = new Calculate();
	//@Test：表示方法是一种测试方法。
	//与JUnit 4的@Test注释不同，此注释不会声明任何属性，因为JUnit Jupiter中的测试扩展基于它们自己的专用注释进行操作。
	//除非被覆盖，否则这些方法是继承的。
	@Test
	public void testAdd() {
		int result = cal.add(3, 3);
		assertEquals(6,result);
	}
	
	@Test
	public void testMinus() {
		int result = cal.minus(5, 2);
		assertEquals(3,result);
	}
}

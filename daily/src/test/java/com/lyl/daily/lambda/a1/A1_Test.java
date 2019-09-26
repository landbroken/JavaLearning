package com.lyl.daily.lambda.a1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class A1_Test {
	@Test
	public void testAdd() {
		// 1.传统方式 需要new接口的实现类来完成对接口的调用
		ICaculator cal0 = new Caculator();
		int result0 = cal0.add(3, 5);
        
		// 2.lambda表达式方式
		ICaculator cal = (a, b)-> {
			return a + b;
		};
		int result = cal.add(3, 5);
		
		assertEquals(8, result);
		assertEquals(result0, result);
	}
}

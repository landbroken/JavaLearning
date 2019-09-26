package com.lyl.daily.lambda.a1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class A1_Test {
	@Test
	public void testAdd() {
		// 1.��ͳ��ʽ ��Ҫnew�ӿڵ�ʵ��������ɶԽӿڵĵ���
		ICaculator cal0 = new Caculator();
		int result0 = cal0.add(3, 5);
        
		// 2.lambda���ʽ��ʽ
		ICaculator cal = (a, b)-> {
			return a + b;
		};
		int result = cal.add(3, 5);
		
		assertEquals(8, result);
		assertEquals(result0, result);
	}
}

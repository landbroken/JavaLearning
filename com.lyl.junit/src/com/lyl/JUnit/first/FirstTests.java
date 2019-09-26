package com.lyl.JUnit.first;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * ��һ����������
 * @author lyl
 *
 */
public class FirstTests {
	private final Calculate cal = new Calculate();
	//@Test����ʾ������һ�ֲ��Է�����
	//��JUnit 4��@Testע�Ͳ�ͬ����ע�Ͳ��������κ����ԣ���ΪJUnit Jupiter�еĲ�����չ���������Լ���ר��ע�ͽ��в�����
	//���Ǳ����ǣ�������Щ�����Ǽ̳еġ�
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

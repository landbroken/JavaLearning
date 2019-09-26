package com.lyl.designpattern.singleton;

/**
 * ���þ�̬�ڲ���ʵ���ӳټ��أ��̰߳�ȫ�ĵ���
 * @author lyl
 *
 */
public class Singleton {
	private Singleton() {}
	
	private static class Inner {
		private static Singleton instance = new Singleton();
	}
	
	public static Singleton getInstance() {
		return Inner.instance;
	}
}

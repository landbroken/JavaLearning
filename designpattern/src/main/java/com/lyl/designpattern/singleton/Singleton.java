package com.lyl.designpattern.singleton;

/**
 * 利用静态内部类实现延迟加载，线程安全的单例
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

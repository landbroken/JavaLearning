package com.lyl.designpattern.singleton;

/**
 * 饿汉式单例，线程安全
 * @author lyl
 *
 */
public class EagerSingleton {
	private static EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton() {}
	
	public EagerSingleton getInstance() {
		return instance;
	}
}

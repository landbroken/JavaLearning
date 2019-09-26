package com.lyl.designpattern.singleton;

/**
 * 懒汉单例，线程不安全
 */
public class LazySingleton {
	private static LazySingleton instance = null;
	private LazySingleton() { }
	public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
 
        return instance;
    }
}

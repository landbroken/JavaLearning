package com.lyl.designpattern.factory;

public interface Factory<T> {
	T getInstance(Class<? extends T> clazz);
}

package com.lyl.designpattern.factory;

import java.lang.reflect.InvocationTargetException;

public class GenericFactory<T> implements Factory<T> {

	public T getInstance(Class<? extends T> clazz) {
        if (clazz == null)
            return null;
 
        try {
            T obj = (T) clazz.getDeclaredConstructor().newInstance();
            return obj;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
	}

}

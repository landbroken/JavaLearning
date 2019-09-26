package com.lyl.designpattern.factory;

import java.util.Map;

public class FData extends Data {
	
	private Map<String, Object> data;
	
	@Override
	public <T> void setData(T t) {
		this.data = t;
	}

}

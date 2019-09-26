package com.lyl.designpattern.factory;

public class Test {
    public static void main(String[] args) {
    	Factory<Car> carFactory = new GenericFactory<>();
        
        Car benz = carFactory.getInstance(Benz.class);
        Car audi = carFactory.getInstance(Audi.class);
        benz.run();
        audi.run();
        
        Data data = new FData();
        data.setData(benz);
    }
}

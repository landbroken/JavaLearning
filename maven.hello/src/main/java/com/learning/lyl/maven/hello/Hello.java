package com.learning.lyl.maven.hello;

/**
 * Hello world!
 *
 */
public class Hello 
{
	public String sayHello() {
		return "Hello Maven";
	}
	
    public static void main( String[] args )
    {
        System.out.println( new Hello().sayHello() );
    }
}

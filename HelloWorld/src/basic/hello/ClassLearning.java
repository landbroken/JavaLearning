package basic.hello;

import basic.dogClass.Dog;

/*
 * 当在一个源文件中定义多个类，并且还有import语句和package语句时，要特别注意这些规则。

一个源文件中只能有一个public类
一个源文件可以有多个非public类
源文件的名称应该和public类的类名保持一致。例如：源文件中public类的类名是Employee，那么源文件应该命名为Employee.java。
如果一个类定义在某个包中，那么package语句应该在源文件的首行。
如果源文件包含import语句，那么应该放在package语句和类定义之间。如果没有package语句，那么import语句应该在源文件中最前面。
import语句和package语句对源文件中定义的所有类都有效。在同一源文件中，不能给不同的类不同的包声明。
*/

public class ClassLearning {

	public static void main(String[] args) {
		Dog dog1=new Dog();
		System.out.println(dog1.GetName());
		
		Dog dog2=new Dog("tony");
		dog2.SetName("mike");
		System.out.println(dog2.GetName());
	}

}

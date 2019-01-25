package basic.dogClass;

/*
 * 一个类可以包含以下类型变量：
 * 局部变量：在方法、构造方法或者语句块中定义的变量被称为局部变量。变量声明和初始化都是在方法中，方法结束后，变量就会自动销毁。
 * 成员变量：成员变量是定义在类中，方法体之外的变量。这种变量在创建对象的时候实例化。成员变量可以被类中方法、构造方法和特定类的语句块访问。
 * 类变量：类变量也声明在类中，方法体之外，但必须声明为static类型。
 * 
 */
public class Dog{
	String name="just a dog";
	String breed;
	int age;
	String color;
	
	/*
	 * 每个类都有构造方法。如果没有显式地为类定义构造方法，Java编译器将会为该类提供一个默认构造方法。
	 * 在创建一个对象的时候，至少要调用一个构造方法。构造方法的名称必须与类同名，一个类可以有多个构造方法。
	 * 下面是一个构造方法示例：
	 */
	public Dog() {
		System.out.println("构造函数，name="+name);
	}
	
	public Dog(String nameIn){
		// 这个构造器仅有一个参数：nameIn
		name=nameIn;
		System.out.println("重载的构造函数，name="+name);
	}
	
	public String GetName(){
		return name;
	}
	
	public void SetName(String nameIn) {
		name=nameIn;
	}
	
	//普通方法	 
	public void sleeping(){
		System.out.println("普通方法，sleeping");
	}
}

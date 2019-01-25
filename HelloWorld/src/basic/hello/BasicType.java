package basic.hello;

class FreshJuice {
	enum FreshJuiceSize{ SMALL, MEDIUM , LARGE }
	FreshJuiceSize size;
}

public class BasicType {
	static void BasicTypePrint(){
		//short,int,long,float,double
		int num=1;
		num+=2;
		System.out.println("int num="+num);
		
		//byte=[-128,127]或ASCII表示的字符
		byte bb=127;
		bb='A';
		System.out.println("byte bb="+bb);
		
		//char
		char chr='z';
		chr='b';
		System.out.println("char chr="+chr);
		
		//boolean
		boolean isTrue=true;
		isTrue=false;
		System.out.println("boolean isTrue="+isTrue);
	}
	
	static void PrintEnumeration() {
		//枚举
		FreshJuice juice = new FreshJuice();
	    juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
	    System.out.println("枚举 juice="+juice.size);
	}
	
	static void PrintConst() {
		//在 Java 中使用 final 关键字来修饰常量，声明方式和变量类似
		final double PI = 3.1415927;
		System.out.println("常量final double PI = "+PI);
	}
	
	static void PrintChange() {
		//自动类型转换方向
		//byte,short,char—> int —> long—> float —> double 
		
		/* 数据类型转换必须满足如下规则：
		 * 1. 不能对boolean类型进行类型转换。
		 * 2. 不能把对象类型转换成不相关类的对象。
		 * 3. 在把容量大的类型转换为容量小的类型时必须使用强制类型转换。
		 * 4. 转换过程中可能导致溢出或损失精度
		 * 5. 浮点数到整数的转换是通过舍弃小数得到，而不是四舍五入
		 * */
		
        int i1 = 123;
        byte b = (byte)i1;//强制类型转换为byte
        System.out.println("int强制类型转换为byte后的值等于"+b);
	}
	
	public static void main(String[] args) {
		BasicTypePrint();
		
		PrintEnumeration();
		
		PrintConst();
		
		PrintChange();
	}

}

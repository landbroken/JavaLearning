package basic.hello;

class FreshJuice {
	enum FreshJuiceSize{ SMALL, MEDIUM , LARGE }
	FreshJuiceSize size;
}

public class BasicType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		//枚举
		FreshJuice juice = new FreshJuice();
	    juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
	    System.out.println("枚举 juice="+juice.size);
	}

}

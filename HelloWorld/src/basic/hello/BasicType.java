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
		
		//byte=[-128,127]��ASCII��ʾ���ַ�
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
		//ö��
		FreshJuice juice = new FreshJuice();
	    juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
	    System.out.println("ö�� juice="+juice.size);
	}
	
	static void PrintConst() {
		//�� Java ��ʹ�� final �ؼ��������γ�����������ʽ�ͱ�������
		final double PI = 3.1415927;
		System.out.println("����final double PI = "+PI);
	}
	
	static void PrintChange() {
		//�Զ�����ת������
		//byte,short,char��> int ��> long��> float ��> double 
		
		/* ��������ת�������������¹���
		 * 1. ���ܶ�boolean���ͽ�������ת����
		 * 2. ���ܰѶ�������ת���ɲ������Ķ���
		 * 3. �ڰ������������ת��Ϊ����С������ʱ����ʹ��ǿ������ת����
		 * 4. ת�������п��ܵ����������ʧ����
		 * 5. ��������������ת����ͨ������С���õ�����������������
		 * */
		
        int i1 = 123;
        byte b = (byte)i1;//ǿ������ת��Ϊbyte
        System.out.println("intǿ������ת��Ϊbyte���ֵ����"+b);
	}
	
	public static void main(String[] args) {
		BasicTypePrint();
		
		PrintEnumeration();
		
		PrintConst();
		
		PrintChange();
	}

}

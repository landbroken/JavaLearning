package basic.hello;

import java.util.Date;

public class StringLearning {

	public static void main(String[] args) {
		//�ַ�������
		String str1="ab";
		String str2="cd";
		String strout=str1+str2;
		System.out.println("�ַ�������strout="+strout);
		
		int num1=55;
		System.out.println("�ַ���+��������="+strout+num1);
		
		//�ַ�������
		System.out.println("�ַ�������strout="+strout.length());
		
		//�ַ�����i���ַ�
		char chrout=strout.charAt(1);
		System.out.println("�ַ�������strout�ڶ�����ĸ="+chrout);
		
		String str3="Hello World! One World One Dream!";
		System.out.println("��ǰ�ַ���str3="+str3);
		System.out.println("����World���һ�γ��ֵ���ţ���0��ʼ����W��λ�ã�="+str3.lastIndexOf("World"));
		
		//�Ӵ�
		String strSub=str3.substring(0, 12);
		System.out.println("str3�����ַ���=[0,12)="+strSub);
		
		//ȥ���ո�
		String strSpace="       i have many space     la   la    ";
		System.out.println("strSpace="+strSpace);
		System.out.println("strSpaceȥǰ��ո�="+strSpace.trim());
		
		//��ʼ�����ж�
		System.out.println("strSub�Ƿ���Hello��ʼ="+strSub.startsWith("Hello"));
		System.out.println("strSub�Ƿ���xx��ʼ="+strSub.startsWith("xx"));
		System.out.println("strSub�Ƿ���World!����="+strSub.endsWith("World!"));
		System.out.println("strSub�Ƿ���xx����="+strSub.endsWith("xx"));
		
		//����ж�
		String str4="ab";
		String str5=new String("ab");
		String str6=new String("Ab");
		System.out.println("==�Ƚ��ַ�����ַ�Ƿ���ͬ��str4==str5�����="+(str4==str5));
		System.out.println("str1==str4������new���ַ�����������ָͬ��ͬһ����ַ�ռ䣬���="+(str1==str4));
		System.out.println("equals�Ƚ��ַ��������Ƿ���ͬ�����="+(str4.equals(str5)));
		System.out.println("���Դ�Сд�Ƚ��ַ��������Ƿ���ͬ�����="+(str4.equalsIgnoreCase(str6)));
		
		//��Сдת��
		String strUpperCase="UPPER Case";
		String strLowerCase="lower Case";
		System.out.println("���д="+strLowerCase.toUpperCase());
		System.out.println("��Сд="+strUpperCase.toLowerCase());
		
		//�ַ����ָ�
		String strSplit="192.168.0.1";
		System.out.println("�ָ�ǰ=["+strSplit+"]");
		String[] strSplitArr=strSplit.split("\\.");
		System.out.print("�ָ��=");
		for(String tmp:strSplitArr)
		{
			System.out.print("["+tmp+"]");
		}
		System.out.println("");
		
		//��ʽ��
		Date date=new Date();
		String strDate=String.format("%tc", date);
		System.out.println(strDate);
	}

}

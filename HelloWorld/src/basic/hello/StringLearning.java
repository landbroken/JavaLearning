package basic.hello;

import java.util.Date;

public class StringLearning {

	public static void main(String[] args) {
		//字符串连接
		String str1="ab";
		String str2="cd";
		String strout=str1+str2;
		System.out.println("字符串连接strout="+strout);
		
		int num1=55;
		System.out.println("字符串+数字连接="+strout+num1);
		
		//字符串长度
		System.out.println("字符串长度strout="+strout.length());
		
		//字符串第i个字符
		char chrout=strout.charAt(1);
		System.out.println("字符串查找strout第二个字母="+chrout);
		
		String str3="Hello World! One World One Dream!";
		System.out.println("当前字符串str3="+str3);
		System.out.println("单词World最后一次出现的序号（从0开始数的W的位置）="+str3.lastIndexOf("World"));
		
		//子串
		String strSub=str3.substring(0, 12);
		System.out.println("str3的子字符串=[0,12)="+strSub);
		
		//去除空格
		String strSpace="       i have many space     la   la    ";
		System.out.println("strSpace="+strSpace);
		System.out.println("strSpace去前后空格="+strSpace.trim());
		
		//起始结束判断
		System.out.println("strSub是否以Hello开始="+strSub.startsWith("Hello"));
		System.out.println("strSub是否以xx开始="+strSub.startsWith("xx"));
		System.out.println("strSub是否以World!结束="+strSub.endsWith("World!"));
		System.out.println("strSub是否以xx结束="+strSub.endsWith("xx"));
		
		//相等判断
		String str4="ab";
		String str5=new String("ab");
		String str6=new String("Ab");
		System.out.println("==比较字符串地址是否相同，str4==str5，结果="+(str4==str5));
		System.out.println("str1==str4，不用new的字符串，内容相同指向同一个地址空间，结果="+(str1==str4));
		System.out.println("equals比较字符串内容是否相同，结果="+(str4.equals(str5)));
		System.out.println("忽略大小写比较字符串内容是否相同，结果="+(str4.equalsIgnoreCase(str6)));
		
		//大小写转换
		String strUpperCase="UPPER Case";
		String strLowerCase="lower Case";
		System.out.println("变大写="+strLowerCase.toUpperCase());
		System.out.println("变小写="+strUpperCase.toLowerCase());
		
		//字符串分割
		String strSplit="192.168.0.1";
		System.out.println("分割前=["+strSplit+"]");
		String[] strSplitArr=strSplit.split("\\.");
		System.out.print("分割后=");
		for(String tmp:strSplitArr)
		{
			System.out.print("["+tmp+"]");
		}
		System.out.println("");
		
		//格式化
		Date date=new Date();
		String strDate=String.format("%tc", date);
		System.out.println(strDate);
	}

}

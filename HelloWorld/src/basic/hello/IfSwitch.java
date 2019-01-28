package basic.hello;

public class IfSwitch {

	public static void PrintIf()
	{
		int x = 30;
	      
	    if( x == 10 )
	    {
	        System.out.println("Value of X is 10");
	    }else if( x == 20 )
	    {
	        System.out.println("Value of X is 20");
	    }else if( x == 30 )
	    {
	        System.out.println("Value of X is 30");
	    }else
	    {
	        System.out.println("这是 else 语句");
	    }
	}
	
	public static void PrintSwitch()
	{
		char grade = 'B';
		
		/*
		 * A输出优秀
		 * B和C输出良好
		 * D输出及格
		 * F输出不及格
		 * 不在范围内，输出未知等级
		 */
	    switch(grade)
	    {
	        case 'A' :
	            System.out.println("优秀"); 
	            break;
	        case 'B' :
	        case 'C' :
	            System.out.println("良好");
	            break;
	        case 'D' :
	            System.out.println("及格");
	            break;
	        case 'F' :
	            System.out.println("不及格");
	            break;
	        default :
	            System.out.println("未知等级");
	    }
	    System.out.println("你的等级是 " + grade);
	}
	
	public static void main(String[] args) {
		PrintIf();
		
		PrintSwitch();
	}

}

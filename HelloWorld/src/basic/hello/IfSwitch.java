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
	        System.out.println("���� else ���");
	    }
	}
	
	public static void PrintSwitch()
	{
		char grade = 'B';
		
		/*
		 * A�������
		 * B��C�������
		 * D�������
		 * F���������
		 * ���ڷ�Χ�ڣ����δ֪�ȼ�
		 */
	    switch(grade)
	    {
	        case 'A' :
	            System.out.println("����"); 
	            break;
	        case 'B' :
	        case 'C' :
	            System.out.println("����");
	            break;
	        case 'D' :
	            System.out.println("����");
	            break;
	        case 'F' :
	            System.out.println("������");
	            break;
	        default :
	            System.out.println("δ֪�ȼ�");
	    }
	    System.out.println("��ĵȼ��� " + grade);
	}
	
	public static void main(String[] args) {
		PrintIf();
		
		PrintSwitch();
	}

}

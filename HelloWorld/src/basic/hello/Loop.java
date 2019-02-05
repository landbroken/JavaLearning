package basic.hello;

public class Loop {
	
	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			System.out.println("forÑ­»·i="+i);
		}
		
		int w=0;
		while(w<5)
		{
			System.out.println("whileÑ­»·w="+w);
			w++;
		}
		
		int d=0;
		do
		{
			System.out.println("do-whileÑ­»·d="+d);
			d++;
		}while(d<5);
		
		int[] arr=new int[] {0,1,2,3,4,5,6,7,8,9};
		for(int tmp:arr)
		{
			System.out.print("["+tmp+"], ");
		}
		System.out.println();
	}
}

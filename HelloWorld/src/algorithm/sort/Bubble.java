package algorithm.sort;

/*√∞≈›≈≈–Ú*/
public class Bubble {
	
	public static void main(String[] args) {
		int[] arr1=new int[] {1,2,3,4,5,9,8,7,6};
		Bubble bb=new Bubble();
		bb.print(arr1,"≈≈–Ú«∞");
		bb.sort(arr1);
		bb.print(arr1,"≈≈–Ú∫Û");
		
		int[] arr2=new int[] {7,2,3,4,5,9,8,1,6};
		bb.print(arr2,"≈≈–Ú«∞");
		bb.sort(arr2,true);
		bb.print(arr2,"≈≈–Ú∫Û");
	}
	
	public void sort(int[] arr)
	{
		this.sort(arr,false);
	}
	
	public void sort(int[] arr,boolean isReverse)
	{
		int flag=isReverse==false?1:-1;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if((arr[i]*flag)>(arr[j]*flag))
				{
					Swap.swap(arr,i,j);
				}
			}
		}
	}
	
	private void print(int[] arr,String before)
	{
		System.out.println(before);
		for(int i=1;i<=arr.length;i++)
		{
			if(i%10==0)
			{
				System.out.println();
			}
			
			System.out.print(arr[i-1]+" ");
		}
		System.out.println();
	}
}

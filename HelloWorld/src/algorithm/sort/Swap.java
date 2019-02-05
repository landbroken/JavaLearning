package algorithm.sort;

public class Swap {

	public static void main(String[] args) {
		
	}
	
	/**
	 * 用于交换数组元素
	 */
	public static void swap(int[] arr,int i,int j)
	{
		int tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
	}
	
}

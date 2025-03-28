package javaprogram;

public class array_ele_zero {
	public static void sum_of_rightside_ele(int n,int [] arr)
	{
		int rightsum=0;
		for(int i=n-1;i>=0;i--)
		{
			arr[i]=rightsum;
			rightsum+=arr[i];
		}
	}
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		sum_of_rightside_ele(n,arr);
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
		
	}

}

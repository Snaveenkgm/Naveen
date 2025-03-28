
public class replace_element
{
	public static void replace_ele(int n,int [] arr)
	{
		int total=0;
		for(int i=0;i<n;i++)
		{
			total+=arr[i];
		}
		for(int i=0;i<n;i++)
		{
			total=total-arr[i];
			arr[i]=total;
		}
	}

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		replace_ele(n,arr);
		for(int num :arr)
		{
			System.out.print(num+" ");
		}

	}

}

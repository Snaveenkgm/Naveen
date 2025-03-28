import java.util.*;
public class swaparray 
{
	public static void main(String[] args) 
	{
		    Scanner sc = new Scanner(System.in);
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		   int st=sc.nextInt();
		   int end=sc.nextInt();
		   for(int i=0;i<n;i++)
		   {
			   for(int j=0;j<n;j++)
			   {
				   if(st<0||end<0||st>arr.length||end>arr.length)
				   {
					   System.out.print("Invalid");
					   break;
				   }
				   else if(i==st&&j==end)
				   {
					   int s=arr[i];
					   arr[i]=arr[j];
					   arr[j]=s;
				   }
				  
				  
			   }
			  
		   }
		   for(int j=0;j<n;j++)
		   {
			   System.out.print(arr[j]+" ");
		   }
	}
}



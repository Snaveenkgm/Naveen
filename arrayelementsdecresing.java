import java.util.*;
public class arrayelementsdecresing {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr1[] = new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
           sum=sum+arr1[i];
            
        }
        for(int i=0;i<n;i++)
        {
           arr1[i]=sum-arr1[i];
           sum=arr1[i];
            
        
        System.out.println(sum);
        }
    }
}


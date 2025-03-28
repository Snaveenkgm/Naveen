import java.util.*;

public class Swapingarray
    


{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int t;
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
        for(int i=0;i<arr.length;i++)
        {
                    System.out.println(arr[i]+" ");

        }

        
        
       
        

    }
}
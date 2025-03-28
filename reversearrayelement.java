import java.util.*;

public class reversearrayelement

    


{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       int t;
       int s=0;
       int e=n-1;
       while(s<e)
       {
        t=arr[s];
        arr[s]=arr[e];
        arr[e]=t;
        s++;
        e--;
       }
        for(int i=0;i<arr.length;i++)
        {
                    System.out.println(arr[i]+" ");

        }

        
        
       
        

    }
}
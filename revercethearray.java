package array;

import java.util.*;

public class revercethearray {
     public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
      
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int r =sc.nextInt(); 
       
        for(int j=0;j<r;j++)
        {
           int s=arr[0];
            for(int i=0;i<n-1;i++){
                arr[i]=arr[i+1];
               
            }
            arr[n-1]=s;
        
      
        }
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
    }
    
}

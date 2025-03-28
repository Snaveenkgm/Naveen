import java.util.*;
public class Main
    
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr1[] = new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
         int secmax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr1[i]>max)
            {
              secmax=max;
              max=arr1[i];
            }
            else if(arr1[i]>secmax&&arr1[i]!=max)
            {
                secmax=arr1[i];
            }
            
        }
        System.out.print(secmax);
        
    }
}
import java.util.*;
class reversearray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
       
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        
       int j=0;
       for(int i=n-1;i>=0;i--)
       {
           arr2[j]=arr1[i];
           j++;
          
       }
 for(int i=0;i<n;i++)
        {
            System.out.println(arr2[i]+" ");
        }

    }
}
package array;

import java.util.*;

public class sumthematrix {
     public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        int arr1[][]= new int[n][n];
        int arr2[][]= new int[m][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
            arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
            arr2[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
            arr2[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int i =0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}

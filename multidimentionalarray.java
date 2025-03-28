package array;
import java.util.*;

public class multidimentionalarray {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][] = new int[n][n];
        for(int r=0;r<n;r++)
        {
            for(int c=0;c<n;c++)
            {
                arr[r][c]=sc.nextInt();
            }
        }
        for(int r=0;r<n;r++)
        {
            for(int c=0;c<n;c++)
            {
               System.out.print(arr[r][c]+" "); 
            }

            System.out.println();
        }
    }
}

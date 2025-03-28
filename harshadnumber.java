import java.util.*;
public class harshadnumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=n;
        int t;
        int sum=0;

        while(n>0)
        {
            t=n%10;
            sum=sum+t;
            n=n/10;
        }
        if(m%sum==0)
        {
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not a Harshad Number");
        }
    }
}

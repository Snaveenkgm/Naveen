import java.util.*;
public class magicno {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t,p;
        int m=n;
        int sum=0;

        while(n>0)
        {
            t=n%10;
            sum =sum+t;
            n=n/10;
        }
        int sum2=sum;
        int rev =0;
        while(sum2>0)
        {
            t=sum2%10;
            rev = rev*10+t;
            sum2=sum2/10;
        }
        if(sum*rev==m)
        {
            System.out.println("Magic");

        }
        else{
            System.out.println("Not Magic");
        }
        
    }
}

import java.util.*;
public class Strongnumber {
    public static void main(String args[])
    {
        
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
       int t;
       int p,sum=0;
        
       while(m>0)
        {
            t=m%10;
            p=1;
        
            for(int i=1;i<=t;i++)
            {
                p=p*i;
            }
            sum=sum+p;
          
            m=m/10;
        }
        if(sum==n)
        {
            System.out.println("a");
        }
        else{
            System.out.println("Not a");
        }
        

    }
}

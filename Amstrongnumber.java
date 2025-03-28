import java.util.*;
public class Amstrongnumber {
    public static void main(String args[])
    {
        
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
        int m=n1;
        int q=n1;
       int t,c=0;
       int p,sum=0;
        while(n1>0)
        {
            n1 =n1/10;
            c++; 
        }
        
       while(m>0)
        {
            t=m%10;
            p=1;
            
            for(int i=1;i<=c;i++)
            {
                p=p*t;
            }
            sum=sum+p;
          
            m=m/10;
        }
        if(sum==q)
        {
            System.out.println("amstrong");
        }
        else{
            System.out.println("Not amstrong");
        }
        

    }
}

import java.util.*;
public class magicnumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
       int t;
       int c=0;
       int p=0;
       int sum=0;
       
     /*  while(n>0)
       {
           n =n/10;
           c++; 
       }*/
        
       while(m>0)
        {
            t=m%10;
            
            p=p+t;
            m=m/10;
         
        }
        int sum2=sum;

       int rev=0;
        while(sum2!=0)
        {
           t=sum2%10;
           rev=rev*10+t;
           sum2=sum2/10;
        }
        
        if(sum*rev==m)
            {
                System.out.println("a");
            }
            else
            {
                System.out.println("not a");

            }
            

        
    }
}

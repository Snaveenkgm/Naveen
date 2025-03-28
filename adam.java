import java.util.*;
public class adam { 

    public static void main(String args[])
    {
        Scanner ab = new Scanner(System.in);
        int a = ab.nextInt();
        int b=a*a;
        int c,rev=0;
        while(b>0)
        {
            c =b%10;
            b=b/10;
            rev = rev*10+c; 
        }
        int i;
        for(i=1;i<=rev;i++)
        {
            if(i*i==rev)
            {
               break;
            }           
        }
        int n1,revs=0;
        while(i>0)
        {
            n1=i%10;
            revs = revs*10+n1;
            i=i/10;
        }
        if(revs ==a)
        {
            System.out.println("Adam number");
        }
        else{
            System.out.println("Not Adam No");
        }












       
    }
    
}

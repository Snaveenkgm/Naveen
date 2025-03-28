
import java.util.*;
 class ece { 

    public static void adam(int a)
    {
       
        int b=a*a;
        int c,rev=0;
        while(b>0)
        {
            c =b%10;
            b=b/10;
            rev = rev*10+c; 
        }
       
        int n1,revs=0;
        while(a>0)
        {
            n1=a%10;
            revs = revs*10+n1;
            a=a/10;
        }
        int t= revs*revs;
        if(t==rev)
        {
            System.out.println("Adam number");
        }
        else{
            System.out.println("Not Adam No");
        }
     
    }
    
}
public class adamnumber2{ 
public static void main(String args[])
{
    Scanner ab = new Scanner(System.in);
    int n = ab.nextInt();
    ece.adam(n);
}
}
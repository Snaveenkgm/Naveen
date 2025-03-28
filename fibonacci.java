import java.util.*;
class fibonacci{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int sum =0,a=0,b=1;

    int i;
    for(i=1;i<=n;i++)
    {
        System.out.print(a+" ");
        sum = a+b;
        a=b;
        b=sum;


    }
}
}
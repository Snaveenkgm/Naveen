import java.util.*;
class demo
{
public static void reverse(int n)
 {
    int p;
    int rev=0;
    
    
    while(n>0)
    {
       p=n%10;
       rev = rev*10+p;
       n=n/10;
    }
           System.out.print(rev);


 }
}
class reversnumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
demo.reverse(n);
}
}
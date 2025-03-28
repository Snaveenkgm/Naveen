import java.util.*;
class demo
{
public static void reverse(int m)
 {
     int n=m;
     int t;
     int c=0;
     int p;
      int sum =0;
     
     while(m>0)
     {
         m=m/10;
         c++;
     }
     m=n;
     while(m>0)
     {
        t=m%10;
        p=1;
     
     for(int i=1;i<=c;i++)
     {
         p=p*t;
     }
     sum = sum+p;
     m= m/10;
     }
     if(sum==n)
     {
         System.out.print("Amstrong no");
     }
     else{
         System.out.print("Not a Amstrong no");
     }

    
    

 }
}
class Amstrongno{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
demo.reverse(n);
}
}
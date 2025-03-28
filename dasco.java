import java.util.*;
class dasco{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,sum=0;
       for(int i=1;i<n;i++)
       {
        if(n%i==0)
        {
            System.out.print(i +" ");
            count++;
            sum=sum+i;

        }
        
       }
       System.out.println();
       System.out.println(count);
        System.out.println(sum);
        if(n==sum)
        System.out.println("Perfect num");
        else
        System.out.println("not a Perfect num");
    }
}
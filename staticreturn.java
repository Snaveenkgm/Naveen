package classes;

import java.util.*;
class ece
{
    public static int sum(int a,int b)
    {
        int c =a+b;
        return c;
    }
}
class staticreturn
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        System.out.print(ece.sum(n1,n2));
    }
    
}
    


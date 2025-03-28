import java.util.*;
public class betrothednumber 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int s1=0;
        int s2=0;

        for(int i=1;i<n1;i++)
        {
            if(n1%i==0)
            {
                s1=s1+i;
            }
        }

        for(int j=1;j<n2;j++)
        {
            if(n2%j==0)
            {
                s2=s2+j;
            }
        }
        if(s1==n2+1 && s2==n1+1)
        {
            System.out.print("Betrothed numbers");
        }
        else{
            System.out.print("Not a Betrothed numbers");
        }
    }
}

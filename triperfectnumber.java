import java.util.*;
public class triperfectnumber
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int s = 0;

    for(int i =1;i<=n;i++)
    {
        if(n%i==0)
        {
            s =s+i;
        }
    }
    if(n*3==s)
    {
        System.out.print("Triperfect Number");
    }
    else
    {
        System.out.print("Not a Triperfect Number");
    }
}
}

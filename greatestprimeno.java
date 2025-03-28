import java.util.*;
class greatestprimeno{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    long num = sc.nextLong();
    long maxi =0;
    for(long i=1;i<=num;i++)
    {
      int count=0;
      if(num%i==0)
      {
        long temp=i;
        for(int j=1;j<=temp;j++)
        {
          if(temp%j==0)
          count++;
        }
      }
      if(count==2) maxi = Math.max(maxi,i);
      }
      System.out.print(maxi);
    }
  }

import java.io.*;
import java.util.*;
public class Code
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    double rs=0;
    if(s<=10000)
    {
      rs=s+(s*0.2)+(s*0.8);
      System.out.printf("Rs.%.2f",rs);
    }
    else if(s<=20000)
    {
      rs=s+(s*0.25)+(s*0.9);
      System.out.printf("Rs.%.2f",rs);
      
    }
    else if(s>20000)
    {
      rs=s+(s*0.3)+(s*0.95);
      System.out.printf("Rs.%.2f",rs);
    }
  }
}
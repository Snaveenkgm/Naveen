import java.util.*;
public class numbercrunching{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem;
        int sum = 1;
        int t,i;
        int c=0;
        int m=n;
        while(m>0){
            
            m=m/10;
            c++;

        }
       
        for(i=1;i<c;i++){
            sum = sum*10;
          
        }

        while(sum>0)
        {
            rem =n/sum;
            n=n%sum;
            sum= sum/10;
           System.out.println(rem);
        }
 

    }

    
}

import java.util.*;

public class numbercrunchinggreaterno {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int s =sc.nextInt();
        int t;
        int max =0;
        
        while(s>0){
            t=s%10;
            s=s/10;
            if(t>max)
            {
                max=t;
                
            }
        }
        System.out.println(max);

    }
}

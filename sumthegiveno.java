import java.util.*;
public class sumthegiveno {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int sum =0;
        for(i=1;i<=n;i++)
        {
            sum = sum+i;
        }
        System.out.println(sum);
    }
}


    import java.util.*;

public class Whileeven {
    public static void main(String args[]){
        int i =1;
        Scanner scan = new Scanner(System.in);
        
        int s=scan.nextInt();
        while(i<=s){
         if(i%2==0)
            {
            System.out.println("Even : "+i);
            
        }
        else if(i%2==1)
            {
            System.out.println("Odd: "+i);
            
        }
            i++;
        }
    }
}



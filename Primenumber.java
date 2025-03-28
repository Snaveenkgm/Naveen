
import java.util.*;
 class Primenumber {
    public static void main(String args[]){
        
        
        Scanner sc = new Scanner(System.in);
        int i =1,c =0,a = sc.nextInt();

        while(i<=a)
        {
            if(a%i==0){
                c++;
                }
                i++;
            }
            /*System.out.println(c);*/
            
            if(c==2){
           System.out.print("prime number") ;
           }
           else {
           System.out.print("Not a prime number");
           }
        }

    }


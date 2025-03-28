import java.util.*;

public class Dowhileeven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int i =1;
        do{
            
            i++;
            if(i%2==0){
            System.out.println(i);
            }
        }while(i<=n);


    }
}
    

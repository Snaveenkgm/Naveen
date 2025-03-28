import java.util.*;
public class Triangle {
    public static void main(String args[]){
        Scanner scan = new scanner(System.in);
        long n1=scan.nextlong();
        long n2=scan.nextLong();
        long n3=scan.nextlong();
        if(n1+n2>n3&&n2+n3>n1&&n3+n1>n2){
            System.out.println("valid");
        }

    }
}

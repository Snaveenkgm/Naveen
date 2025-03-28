import java.util.Scanner;

public class Eligible_for_loan_or_not {
     public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int salary,age,loan;
    salary = scan.nextInt();
    age = scan.nextInt();
    if(salary>=20000 || age<25){
        System.out.println("Eligiable for loan");
        loan =scan.nextInt();
        if(loan<=50000){
            System.out.println("loan available");
        }
    }
        else{
            System.out.println("no loan available");
        }
    }
}

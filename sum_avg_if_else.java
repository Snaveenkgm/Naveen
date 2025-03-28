import java.util.Scanner;

public class sum_avg_if_else {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int s1,s2,s3,s4,s5;
    s1 = scan.nextInt();
    s2 = scan.nextInt();
    s3 = scan.nextInt();
    s4 = scan.nextInt();
    s5 = scan.nextInt();
    
    int totalmark = s1+s2+s3+s4+s5;
    int avg = totalmark/5;
    
    if(avg<35){
        System.out.print("Additional class is required");
    }
    else{
        System.out.print("No Additional class required");
    }
    }
}

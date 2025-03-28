import java.util.Scanner;

public class String_and_Integer {
     public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter name =");
       String name = scan.nextLine();
       System.out.println("Enter mark =");
       double mark = scan.nextInt();
       System.out.println("Enter department =");
       scan.nextLine();
       String department = scan.nextLine();
       System.out.println(name);
       System.out.println(mark);
       System.out.println(department);
}
}

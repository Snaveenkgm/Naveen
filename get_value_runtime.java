import java.util.Scanner; 
class getvalruntime{
    public static void main(String[] args){
        int a,b,c;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value a =");
        a = scan.nextInt();
        System.out.println("Enter the value b =");
        b = scan.nextInt();
        c=a+b;
        System.out.println("The sum of c is"+c);
        System.out.println(c);
        
    }
}
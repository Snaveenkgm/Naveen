import java.util.Random;
public class Random_no_using_while_loop {
    public static void main(String[] args){
    Random rand = new Random();
       int newnum=0;
        while( newnum!=5){
            newnum = rand.nextInt(10);
            System.out.println(newnum);
        }
    }
}

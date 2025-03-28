import java.util.*;
class demo{
public static void numbers(int n1,int n2){
    int p=1;
for(int i=1;i<=n2;i++){
p=p*n1;
}
System.out.print(p);
}
}
class powermathod{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
demo.numbers(n1,n2);
}
}
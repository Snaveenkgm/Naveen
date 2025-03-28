public class Nested_if {
    public static void main(String[] args){
        boolean kfc = true;
        boolean chicken = true;
        boolean pepsi = true;
        if(kfc){
            System.out.println("Enter KFC");
            if(chicken){
                System.out.println("Enter Chicken");
                if(pepsi){
                    System.out.println("Enter pepsi");
                }
             }
        }
    }
}

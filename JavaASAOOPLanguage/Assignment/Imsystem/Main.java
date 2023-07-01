import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Product pr = new Product(1,"abc",100.0,5,"gjsgsdgdd","mobile");
        //System.out.println(pr);

        Product pr1 = new Product(1,"xyz",100.0,5,"gjsgsdgdd","laptop");

        ArrayList<Product> arr = new ArrayList<>();
        arr.add(pr);
        arr.add(pr1);

        for(Product obj : arr){
            System.out.println(obj.toString());
        }
    }
}
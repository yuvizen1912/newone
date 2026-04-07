package src.Ecommerce.Model; ;

public class Product1 {
    public static String productname;
    public static double price;
    public static void getproduct(String n , double d){
        productname = n;
        price = d;
    }
    public static void showdetails(){
        System.out.println("product name:" + productname);
        System.out.println("price" +price );
    }
}

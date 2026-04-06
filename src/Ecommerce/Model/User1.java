
package src.ecommerce.Model;


public class User1 {
    public static String name ;
    public  static String address;
    public static void addetails(String n,String add){
        name = n;
        address =add;
    }
    
    public static void printdetails(){
              System.out.println("name:" + name);
              System.out.println("Address: " + address);
    }
}

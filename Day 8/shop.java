import java.util.*;
class Product{
    int id;
    String name;
    double price;
    int quantity;
    Product(int id , String name,double price,int quantity){
        
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public  double gettotalprice(){
        return price*quantity;
    }
    public void display(){
        System.out.print(name+" ");
        System.out.print(quantity +" " );
    }
   
}
public class shop {
     public static void grandtotal(Product[] p){
        double tot = 0;
        for(int i =0;i<p.length;i++){
            tot+= p[i].price;
        }
        System.out.print("grantotal" + tot);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        Product[] cart = new Product[n];
        for(int i = 0;i<n;i++){
            System.out.print("give details\n id \nname\nprice\nquantity");
            int id = sc.nextInt();
            String name = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();

            cart[i] = new Product(id,name,price,quantity);

        }
        System.out.print("Productname quantity  total price \n");
        for(int i=0;i<n;i++){

            cart[i].display();
            System.out.print(cart[i].gettotalprice() );
            System.out.println(" ");
        }
        grandtotal(cart);
        sc.close();
        
    }
}

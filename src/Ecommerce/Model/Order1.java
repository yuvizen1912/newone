package src.Ecommerce.Model;
import src.Ecommerce.Model.*;

public class Order1 {
    public int quantity;
    

    public Order1(String product,int quantity) {
        this.quantity = quantity;
        User1.addetails("Bala","Chennai");
        Product1 p = new Product1();
        p.getproduct(product,200);
    }


    public int getQuantity() {
        return quantity;
    }
}
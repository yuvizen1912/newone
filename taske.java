
class Productoutofstack extends Exception{
    public Productoutofstack (String msg){
            super(msg);
    }
}
class Paymentfailed extends Exception{
    public Paymentfailed(String msg){
            super(msg);
    }
}
class Orderprocessing extends Exception{
    public Orderprocessing(String msg){
            super(msg);
    }
}
class product {
    String name;
    int stock,price;
    public product(String name,int stock,int price) throws Productoutofstack{
            this.name = name;
            this.stock = stock;
            this.price = price;
    
    if(stock < 1){
        throw new Productoutofstack("product is out of stack");
    }
    else{
        System.out.println("product: "+name + " total:"+price);
    }
}
}
class User {
    String name,address;
    
    User(String name,String address){
            this.name = name;
            this.address = address;
    }
}
class Order {
    product product;   // object
    User user;         // object
    int quantity;

    Order(product product, User user, int quantity){
        this.product = product;
        this.user = user;
        this.quantity = quantity;
    }
}
class orderService {
    void placeorder(Order order)throws Productoutofstack, Paymentfailed,Orderprocessing{
        if(order.product.stock <=0) throw new Productoutofstack("Out of stack");
        if(Math.random() < 0.4){
            throw new Paymentfailed("payment failed");
        }
         if(Math.random() < 0.2){
            throw new Orderprocessing("Orderprocessing failed");
        }

    } /*order.product.stock -= order.quantity
    print("order placed successfully") */
}
            
    
   
public class taske {
    public static void main(String[] args) throws Productoutofstack {          
           product p = new product("mouse",1,200);
           User u =   new User("test","abc");
           Order o = new Order(p,u,3);
           orderService s = new orderService();
           orderService service = new orderService();

try {
    service.placeorder(o);
} catch (Productoutofstack e) {
    System.out.println(e.getMessage());
} catch (Paymentfailed e) {
    System.out.println(e.getMessage());
} catch (Orderprocessing e) {
    System.out.println(e.getMessage());
}



                                                                                                                                           
        
    }
    
}

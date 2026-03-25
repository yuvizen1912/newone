import java.util.ArrayList;

class Cart {
    ArrayList<String> items;
    double totalPrice;

    Cart() {
        items = new ArrayList<>();
        totalPrice = 0;
        System.out.println("Cart created");
    }

    void addItem(String item, double price) {
        items.add(item);
        totalPrice += price;
        System.out.println(item + " added to cart");
    }

    void removeItem(String item, double price) {
        if(items.remove(item)) {
            totalPrice -= price;
            System.out.println(item + " removed from cart");
        } else {
            System.out.println(item + " not found in cart");
        }
    }

    void displayCart() {
        System.out.println("Cart Items: " + items);
        System.out.println("Total Price: " + totalPrice);
    }
}

 class User {
    String name;
    String phone;
    String address;
    String role = "User";
    Cart cart;   // 🔥 Cart included here

   User(String name2, String phone2, String address2){
          System.out.println("User is created");
   }

    User(String name) {
        this.name = name;
        cart = new Cart();
        System.out.println("User created");
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("Role:" + role);
    }
}
class Rideuser extends User{
    String Vehicletype;
     Rideuser(String name,String phone, String address,String x ){
          super(name,phone,address);
           Vehicletype = x;
          
     }
     void displayride(){
        System.out.println("The ride was successful ");
     }
     void displayinfo(){
        System.out.println(name);
        System.out.println(phone);
        System.out.println(address);
        System.out.println(Vehicletype);
        

     }


}


class Driver extends User {
    String role = "Driver";
    String vehicle;

    Driver(String name, String vehicle) {
        super(name);
        this.vehicle = vehicle;
    }

    void displayDriver() {
        super.display();
        System.out.println("Vehicle:" + vehicle);
        System.out.println("Driver class role:" + role);
        System.out.println("User class role:" + super.role);
    }
}

class FoodUser extends User {
    String favfood;

    FoodUser(String name,String food) {
        super(name);
        favfood = food;
        System.out.println("FoodUser created "+name);
    }
    void display(){
        System.out.println(favfood);
    }
}
class ParcelUser extends User {
    int pweight;

    ParcelUser(String name,int weight) {
        super(name);
        pweight = weight;
        System.out.println("ParcelUser created "+name);
    }
    void display(){
        System.out.println("Parcel of weight "+pweight+"is delivered");
    }
}



class TravelUser extends User {
    String loc;

    TravelUser(String name) {
        super(name);
        System.out.println("TravelUser created");
    }
}

public class app {
    public static void main(String[] args) {
        /*Driver d = new Driver("Siva", "BMW m-competition");
        d.displayDriver();

        // 🔥 Using Cart
        d.cart.addItem("Burger", 120);
        d.cart.addItem("Pizza", 250);
        d.cart.displayCart();*/

      Rideuser r = new  Rideuser("Raj","8989897532","chennai","Car");
      r.displayride();
      r.displayinfo();
      FoodUser f = new FoodUser("Siva", "Pizza");
      f.display();
      ParcelUser p = new ParcelUser("Box",2);
      p.display();


    }
}
package src.Ecommerce.Main; // Removed 'src.'


import src.Ecommerce.Model.*; 
import src.Ecommerce.Service.*;


public class Main1 {
    public static void main(String[] args) {
        // Ensure the class name starts with a Capital if you renamed the file
        Orderservice os = new Orderservice(); 
        os.showOrderDetails();
    }
}
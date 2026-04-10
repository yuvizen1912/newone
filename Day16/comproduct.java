package Day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
    
    String name;
    int price;
    int rating;

    Product(int price,String name,int rating) {
        
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String toString() {
        return name + "-" + price+ "-" + rating;
    }
}

public class comproduct {
    public static void main(String[] args) {
         List<Product> products = new ArrayList<>();

        products.add(new Product(6, "x", 80));
        prooducts.add(new Product(4, "q", 80));
        products.add(new Student(1, "y", 95));
       

        Comparator<Product> byId = new Comparator<Product>() {
            public int compare(Product a, Product b) {
                return Integer.compare(a.price,b.price);
            }
        };

        Collections.sort(Product, byId);
        System.out.println(Product);
    }
    
}

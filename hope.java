
import java.util.*;
public class hope {
    public static void main (String[] args){
        /*System.out.println("hello java");
        short a = 8;
        int b = (int)10;
        System.out.println("Implicit:" + b);
        double c = 6.23;
        int g = (int) c;
        System.out.println("explicit" + g);
        long s = 1000;
        int f = 101;
        System.out.print(f*s);
        float area = 0;*/
        Scanner sc = new Scanner(System.in);
        /*float r = sc.nextFloat();
        double pi = 3.1428262729;
        System.out.print(pi*r*r);*/
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b && a > c){
            System.out.print(a);
        }
        else if(b > c && b > a){
            System.out.print(b);
        }
        else{
            System.out.print(c);
        }


    }
}

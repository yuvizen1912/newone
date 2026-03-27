package day7;
class Calculator{
    int add(int num1,int num2){
         return num1 + num2;    
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(float a ,float b){
            return a + b;
    }
}
public class Math {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(10,20));
        double g = c.add(10,20.0);
        System.out.println(g);
    }
}

public class method{
    public static int mul(int a , int b){
        return a * b;
    }
    public static int square(int a){
        return mul(a,a);
    }
    public static void printn(int n){
        System.out.println(square(n));
    }
    public static int gca (int a, int b){
        if(b == 0){
            return a;
        }
        return gca(b,a%b);
    }
    public static int change(int x){
        x = 20;
        System.out.print("indside:"+x);
        return x;
    }
    public static void main(String[] args) {
        int var = 4;
        change(var);
        System.out.println("Outside"+ var);
        printn(var);
        var = change(var);
        System.out.println(var);
        int k = gca(10,12);
        System.out.print(k);

    }

}

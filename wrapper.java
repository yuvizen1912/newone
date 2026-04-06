public class wrapper{
    public static int test1(String s){
            return Integer.valueOf(s);
        } 
    public static void main(String[] args){
        
        Integer b = Integer.valueOf("12546");//return type-> object
        Integer c = Integer.parseInt("0987");//return type->int(int)
        System.out.println(b);
        System.out.println(c);
        System.out.println(test1("25869"));
        int a = b.intValue();// Converts Integer to int
        System.out.println(a);
        Integer x = 200;
        Integer y = 200;
        System.out.println(x == y);
        System.out.println(x.equals(y));
    }
}                                                                                                 //
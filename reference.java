public class reference {
    public int marks;
    static void change(reference r){
        r.marks = 20;
        System.out.print("Inside" + r.marks);
    }
    public static void main(String[] args) {
        reference r1 = new reference();
        r1.marks = 80;
        change(r1);
        System.out.print(r1.marks);
        
    }
}

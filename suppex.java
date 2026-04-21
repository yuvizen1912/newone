import java.util.function.Supplier;

public class suppex {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random() * 100);
        System.out.println(s.get());

        Supplier<Person> p = () -> new Person();
        System.out.println(p.get().name);
    }
}

class Person {
    String name = "Supplier";
}
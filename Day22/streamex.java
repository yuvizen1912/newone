import java.util.List;
class Employee{
    String name;
    int salary;
    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){ return name;};
    public int getSalary(){return salary;}
    public String toString() {
        return name+" "+salary;
    } 
}
public class streamex{
    public static void main(String[] args){
        //map
        List<Integer> numbs = List.of(2,3,4,5,6);
        List<Integer> mulby2 = numbs.stream()
                           .map(i -> i * 2)
                           .toList();
        System.out.println(mulby2);
        List<Integer> even = numbs.stream().filter((i) -> i% 2 == 0).toList(); 
        System.out.println(even);
        List<Employee> employees = List.of(new Employee("Emp1",222222),new Employee("Emp2",444444));
        List<String> names = employees.stream().map((i) -> i.getName()).toList();
        System.out.println(names);
        List<Employee> gs  = employees.stream().filter((i) -> i.getSalary() > 30000).toList();
        System.out.println("After filter" + gs.toString());
        

    }

}
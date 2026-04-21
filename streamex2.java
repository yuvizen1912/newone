import java.util.List;

public class streamex2 {
    public static void main(String[] args){
        List<Employee> employees = List.of(new Employee("Emp1","IT",222222,22,"dev"),new Employee("Emp2","CSE",444444,24,"HR"));


        List<String> names = employees.stream()
    .filter(i -> i.getdept().equals("dev")) // keep only dev
    .map(i -> i.getName())                  // extract names
    .toList();
        System.out.println(names);
        List<Employee> gs  = employees.stream().filter((i) -> i.getSalary() > 30000).toList();
        System.out.println("After filter" + gs.toString());
        int totalSalary = employees.stream()
    .mapToInt(i -> i.getSalary())
    .sum();
    int avgn = employees.stream()
    .mapToInt(i -> i.getSalary())
    .avg();
    }
    
}
class Employee{
    String name;
    String department;
    int salary;
    int age;
    String job;
    Employee(String name,String department,int salary,int age,String dev){
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
        this.job = dev;

    }
    public String getName(){ return name;};
    public int getSalary(){return salary;}
    public String getdept(){ return department;};

    public String toString() {
        return name+" "+salary;
    }
    
}

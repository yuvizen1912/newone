package Day16;
import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int mark;
    Student(String name,int mark){
        this.name = name;
        this.mark = mark;
    }

/*public int compareTo(Student s) { // for printing in ascending
       return this.mark-s.mark;    
}*/
public int compareTo(Student s) { // for printing in descending
       return s.mark - this.mark;    
}
public String toString(){
     return name +"-" + mark;
}
}
public class comparable{
    public static void main(String[] args){
        List<Student> s = new ArrayList<>();
        s.add(new Student("A",70));
        s.add(new Student("B",60));
        s.add(new Student("C",75));
        s.add(new Student("D",40));
        Collections.sort(s);
        for(Student t: s){
            System.out.println(t.name +" "+t.mark);
        }


    

    }
}

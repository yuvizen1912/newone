 class Student{
        String name = "Ram";
        int rollno = 254;
        char ch;
        Student(){
            System.out.println("no one");
        }
        Student(int r, String n){
            rollno = r;
            name = n;
        }
        /*Student(int r, String s, char v){
            rollno = r;
            name = s;
            ch = v ;
        }*/
        Student(String name ,int rollno, char ch){
            this.name = name;
            this.rollno = rollno;
            this.ch = ch;
        }
    }
public class oop{
    
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("y",260,'A');

        System.out.println(s1.rollno);
        System.out.print(s2.name + " "+ s2.ch);





















































    

    }

}

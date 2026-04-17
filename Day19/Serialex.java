package Day19;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable{
    String name;
    int mark;
    Student(String name,int mark){
        this.name = name;
        this.mark = mark;
    }
}

public class Serialex{
    public static void main(String[] args) throws IOException {
        Student s = new Student("XYZ",44);
        File file = new File("Student.txt");
        FileOutputStream fo = new  FileOutputStream("Student.txt");
        ObjectOutputStream objs;
        if(file.length() == 0){
             objs =  new ObjectOutputStream(fo);
        }
        else{
            objs = new CustomObjectOutputStream(fo); // appending to the existing serialization file.
        }
        objs.writeObjects(s);
        fo.close();
        objs.close();
    }
}

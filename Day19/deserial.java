package Day19;
import java.io.*;

public class deserial {
    public static void main(String[] args) throws IOException {
          FileInputStream fi = new FileInputStream("student.txt");
          ObjectInputStream objs = new ObjectInputStream(fi);
          while(true){
            try {
                Student s = (Student)ObjStream.readObject();
                System.out.println(s.name + " " + s.mark);
            } catch (Exception e) {
                break;
            }
          }
          
          fi.close();
          objs.close();
    }
}

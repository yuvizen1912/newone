package DAY18;

import java.io.*;


public class fileread {
    public static void main(String[] args) {
        /*try {
           FileReader fr = new FileReader("yest.txt");
           int charc ;
           while((charc = fr.read())!= -1){
            
            System.out.print((char)charc);
           }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }*/
       try {
           BufferedReader fr = new BufferedReader(new FileReader("yest.txt"));
           String line ;
           while((line = fr.readLine())!= null){
            
            System.out.println(line);
           }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

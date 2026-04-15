package DAY18;

import java.io.*;

public class Buff {
    public static void main(String[] args) throws IOException {
       
       try{
       BufferedWriter w = new BufferedWriter(new FileWriter("yest.txt"));
       w.write("using buff writer");
       w.newLine();
       w.close();
    }
       catch(IOException e){
           System.out.println(e);
       }


    }
}


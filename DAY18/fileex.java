package DAY18;

import java.io.*;

public class fileex {
    public static void main(String[] args) throws IOException {
       /* try{
        File nf = new File("yest.txt");
        
        if(nf.createNewFile()){
            System.out.println("file created :" + nf.getName());
        }
        else{
        System.out.println("not able to create a file ");}
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }*/
       try{
       FileWriter w = new FileWriter("yest.txt");
       w.write("using file writer");
       w.close();
    }
       catch(IOException e){
           System.out.println(e);
       }


    }
}

package Day16;
import java.util.*;

public class Traversal {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
       /* for(int i : list){
            if(i == 4 ){
                list.remove(i);         //Concurrent Modification Exception. -> This occurs when we try to change during traversing.
            }*/
           ListIterator<Integer> it = list.listIterator();
           /*while(it.hasNext()){
            int //"current = it.next();"
            if(current == 4){
                it.remove();
            }
            System.out.println(current);
           }
           System.out.println(list);*/
           while(it.hasNext()){
            it.next();
           
            
        }

        System.out.println(list);

        // Backward traversal
        while(it.hasPrevious()){
            int current = it.previous();
            System.out.println(current);
        }


       
    }
}



package day13;
import java.util.*;

 

public class Alist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,2,4,6,8,3,3,3,5,5,7,9,9,1,1,5));
        /*list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(0));
          System.out.println(list);
        list.remove(2);
        System.out.println(list.contains(5));*/
        
        for(int i=0;i<list.size();i++){
            if(list.get(i) % 2 == 0){
                list.remove(list.get(i));
                i--;
            }
        }
         Collections.sort(list);
         
         System.out.println(list);
        for(int i=0;i<list.size() - 1;i++){
            if(list.get(i) == list.get(i + 1)){
                list.remove(list.get(i));
                i--;
            }
        }
         System.out.println(list);


    }
    
}

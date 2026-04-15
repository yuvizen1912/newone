package DAY18;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class balloon {
    public static void main(String[] args) {
       List<List<Integer>> list = Arrays.asList(
    Arrays.asList(1, 6),
    Arrays.asList(2, 8),
    Arrays.asList(7, 12),
    Arrays.asList(10, 18)
);
        Collections.sort(list,(a,b) -> a.get(0) - b.get(0));
        int start = list.get(0).get(0);
        int end = list.get(0).get(1);
        int c =0;
        int i =1;
        while(i < list.size()){
            if(end >= list.get(i).get(0) && end < list.get(i).get(1) ){
                i++;
            }
            else{
                c++;
                start = list.get(i).get(0);
                end = list.get(i).get(1);
                i++;
            }
        }
        System.out.println(c + 1);
        
    }
}

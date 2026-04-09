package DAY14;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class setexample {
    Set<Integer> ll = new LinkedHashSet<>();
    Set<Integer> hs = new HashSet<>();
    int[] arr = {5,3,9,1,7,2};
    for(int i:arr){
        ll.add(i);
        hs.add(i);
    }
    System.out.println(ll);
    System.out.println(hs);


}

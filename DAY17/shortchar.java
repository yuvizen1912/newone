package DAY17;
import java.util.*;

public class shortchar {
    public static List<Character> shortchar(String s){
        // 1.calculating the frequency
           Map<Character,Integer> map = new HashMap<>();
           for(int i =0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
            
           }
           // 2.Map is stored in list
           List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
           // 3.sort
          /* Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>() {
            @Override
            public int compare(Map.Entry<Character,Integer> a,Map.Entry<Character,Integer> b){
                if(! a.getValue().equals(b.getValue())){
                    return b.getValue()  - a.getValue();
                }
                return a.getKey() - b.getKey();
            }
           });*/
            // lamda method
            Collections.sort(list, (a, b) -> {
    if (!a.getValue().equals(b.getValue())) {
        return b.getValue() - a.getValue(); // descending by value
    }
    return a.getKey() - b.getKey(); // ascending by key
});
            
           List<Character> res = new ArrayList<>();
           for(Map.Entry<Character,Integer> i:list){
            res.add(i.getKey());
           }
         


           
           return res;
    }
    public static void main(String[] args) {
        String str = "tree";
        System.out.println(shortchar(str));

    }
}

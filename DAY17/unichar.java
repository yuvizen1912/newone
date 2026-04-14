package DAY17;

import java.util.*;

public class unichar {
    
    public static int  firstUniqChar(String s) {
        Map<Character,Integer> hm = new HashMap<>();
        for(int i =0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0) + 1);
        }
        char[] ch = s.toCharArray();
        for(int i =0;i<ch.length;i++){
            if(hm.get(ch[i]) == 1){
                   return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(firstUniqChar(s));
    }
}

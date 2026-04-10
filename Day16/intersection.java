package Day16;
import java.util.*;

class intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> SetA = new HashSet<>();
        HashSet<Integer> SetB = new HashSet<>();
        for(int i:nums1){
            SetA.add(i);
        }
        for(int j:nums2){
            SetB.add(j);
        }
        SetA.retainAll(SetB);
     
        int[] res = SetA.stream()
               .sorted()
               .mapToInt(Integer::intValue)
               .toArray();
        return res;
    }
}
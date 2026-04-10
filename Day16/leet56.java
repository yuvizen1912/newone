package Day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class leet56 {
    public int[][] merge(int[][] intervals) {
    
Comparator<int[]> byz = new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return Integer.compare(a[0],b[0]);
            }
        };
        Arrays.sort(intervals,byz);
        List<int[]> res = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int[] curr = intervals[i];
            if(res.isEmpty() || res.get(res.size() - 1)[1] < curr[0]){
                      res.add(curr);
            }
            else{
                int[] merge = res.get(res.size() - 1);
                merge[1] = Math.max(merge[1],curr[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
    public static void main(String[] args) {

        leet56 obj = new leet56();

        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        int[][] result = obj.merge(intervals);

        // Print result
        System.out.println("Merged Intervals:");
        for (int[] arr : result) {
            System.out.println(arr[0] + " " + arr[1]);
        }
    }
}

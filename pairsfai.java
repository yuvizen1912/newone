import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1,7,9,2,5};
        int up = 11;
        int lr = 11;

      
        int left = 0, right = arr.length - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum > up) {
                right--; 
            } else if (sum < lr) {
                left++; // too small, increase sum
            } else {
                
                count++;

                
                
                right--;
            }
            if(right == left + 1){
                left++;
                right = arr.length - 1;

            }
        }

        System.out.println(count);
    }
}
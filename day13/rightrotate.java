package day13;

public class rightrotate {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        int k = 4;
        int l = nums.length;
        int left =0,right  = k + 1;
        while(left<k &&  right < l){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right++;
        }
        for(int i =0;i<l;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println(left);
        for(int i = left ;i<l- 1;i++){
            for(int j = i + 1;j<l;j++)
            if(nums[i] > nums[j]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

            }
        }
        for(int i =0;i<l;i++){
            System.out.print(nums[i] + " ");
        }

    }
}

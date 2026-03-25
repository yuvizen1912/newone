public class shufflearray {
    
    public int[] shuffle(int[] nums, int n) {
        int[] arr1 = new int[n];
        int[] arr2 = new int[nums.length - n];
        for(int i =0;i<n;i++){
            arr1[i] = nums[i];
        }
        int k =0;
        for(int i = n;i<nums.length;i++){
            arr2[k] = nums[i];
            k++;
        }
        int[] res = new int[nums.length];
       
        for(int i = 0, g = 0; i < nums.length && g < arr1.length; i += 2, g++){
    res[i] = arr1[g];
}

for(int i = 1, x = 0; i < nums.length && x < arr2.length; i += 2, x++){
    res[i] = arr2[x];
}
        
         return res;
    }
        
        /*int i =0,j=n;
        int k =0;
        int[] arr = new int[nums.length];
        while(j < nums.length){
            arr[k] = nums[i];
            arr[k + 1] = nums[j];
            i++;
            j++;
            k+=2;

        }
        return arr;*/
    }


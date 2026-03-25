class rotatearray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int m = k;              
        int l2 = n - k;         

        int[] arr1 = new int[m];
        int[] arr2 = new int[l2];

        
        for(int i = 0; i < m; i++){
            arr1[i] = nums[n - k + i];
        }

        
        for(int i = 0; i < l2; i++){
            arr2[i] = nums[i];
        }

        
        for(int i = 0; i < m; i++){
            nums[i] = arr1[i];
        }

        
        for(int i = 0; i < l2; i++){
            nums[m + i] = arr2[i];
        }
    }
}


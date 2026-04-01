public class Main {
    public static boolean isInc(int i, int j, int[] nums) {
        boolean flag = true;
        for (int k = i; k < j; k++) {
            if (nums[k] > nums[k + 1]) {
                flag = false;
            }
        }
        return flag;
    }

    public static boolean isDec(int i, int j, int[] nums) {
        boolean flag = true;
        for (int k = i; k < j; k++) {
            if (nums[k] < nums[k + 1]) {
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 7, 3, 2, 5};
        int n = nums.length;
        for (int i = 0; i < n ; i++) {
            for (int j = i + 2; j < n; j++) {
                if (isInc(i, j - 1, nums) && isDec(j - 1, j, nums)) {
                    int length = j - i + 1;
                    if (length >=3 && length % 2 == 1) {
                        for (int k = i; k <= j; k++) {
                            System.out.print(nums[k] + " ");
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}
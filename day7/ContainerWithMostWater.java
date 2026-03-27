package day7;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int ma = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            ma = Math.max(ma,(right - left)* Math.min(height[left],height[right]));
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        } 
        return ma;
    }
}

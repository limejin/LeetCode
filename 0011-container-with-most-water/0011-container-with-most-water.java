class Solution {
    public int maxArea(int[] height) {
        int sum=0;

        int start=0;
        int end=height.length-1;

        while(start<end){
            int temp_sum=(Math.min(height[start],height[end]))*(end-start);

            if(sum<temp_sum) sum=temp_sum;

            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }

        }

        return sum;
    }
}
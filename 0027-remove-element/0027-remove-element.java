// - 8 : 35
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        // k : val의 index
        for (int i=0;i<nums.length;i++){
           
            if(nums[i]!=val) { 
                nums[k]=nums[i];
                k++;
            }
        }
        
        // [3, 2, 2, 3]
        // [2, 2, 2, 3]
        // [2, 2, 2, 3]
        // [2, 2, 2, 3] => 검사 시, sort 작업이 있기 때문에

        return k;
    }
}
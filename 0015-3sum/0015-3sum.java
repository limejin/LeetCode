class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer= new ArrayList<>();
        
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue; 
            int left_sum=0-nums[i];
            int start=i+1;
            int end=nums.length-1;

            while(start<end){
                if (start > i + 1 && nums[start] == nums[start - 1]) { 
                    start++;
                    continue;
                }
                if (end < nums.length - 1 && nums[end] == nums[end + 1]) { 
                    end--;
                    continue;
                }

                int temp_sum=nums[start]+nums[end];
                if(temp_sum==left_sum)
                {
                    answer.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                }else if(temp_sum<left_sum){
                    start++;
                }else{
                    end--;
                }
            }
        }

        return answer;
    }
}

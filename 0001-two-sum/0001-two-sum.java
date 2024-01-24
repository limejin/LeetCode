// - 8 : 50
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];

        if(nums.length==2) {
            answer[0]=0;
            answer[1]=1;

            return answer;
        }

        Map<Integer, Integer> map=new HashMap<>();

       for(int i=0;i<nums.length;i++){
           if(map.containsKey(target-nums[i])){
               answer[0]=i;
               answer[1]=map.get(target-nums[i]);
               return answer;
           }else{
               map.put(nums[i],i);
           }
       }

        return answer;
    }
}
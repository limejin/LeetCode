// - 8 : 55
class Solution {
    int[] answer={-1,-1};
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return answer;
        
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(nums[mid]==target){
                start=mid;
                end=mid;
                while(start-1>=0){
                    if(nums[start-1]==target) start--; 
                    else break;
                }

                while(end+1<=nums.length-1){
                    if(nums[end+1]==target) end++;
                    else break;
                }

                answer[0]=start;
                answer[1]=end;
                return answer;
            }

            if(nums[mid]<target){
                start=mid+1;
            }

            if(nums[mid]>target){
                end=mid-1;
            }
        }

        return answer;
    }
}
// - 9:25
class Solution {
    int answer=-1;
    public int search(int[] nums,int target) {
        if(nums.length==1 && nums[0]==target) return 0;

        bs(0,nums.length-1,nums,target);
        

        return answer;
    }

    public void bs(int start, int end, int[] nums,int target){
        if(start<=end){
            int mid=(start+end)/2;

        if(nums[mid]==target) {
            answer=mid;
            return;
        }else{
            bs(mid+1, end, nums,target);
            bs(start, mid-1, nums,target);
        }
        }
        
    }
}
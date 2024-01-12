// - 9 : 00
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] answer = new int[2];

        if(numbers.length==2){
            answer[0]=1;
            answer[1]=2;

            return answer;
        }

        for(int i=0;i<numbers.length-1;i++){
            answer[0]=i+1;
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    answer[1]=j+1;
                    break;
                }
            }
            if(answer[1]!=0) break;
            else continue;
        }
        
        return answer;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")) return 0;
        char sArray[] = s.toCharArray();
        String total_s ="";
        int answer=Integer.MIN_VALUE;
        for(int i=0;i<sArray.length;i++){
            total_s+=sArray[i];
            int temp_i=i;

            while(temp_i<sArray.length){

                if(temp_i==i) {
                    temp_i++;
                }else{
                    if(total_s.contains(String.valueOf(sArray[temp_i]))){
                        break;
                    }else {
                        total_s+=sArray[temp_i];
                        temp_i++;
                    }
                }
             
            }

            answer=Math.max(answer, total_s.length());
            total_s="";
        }
        return answer;
    }

}
// 9 : 00
class Solution {
    public String reverseWords(String s) {
        String answer="";
        String[] sarray=s.trim().split("\\s+");
        for(int i=sarray.length-1;i>=0;i--){
            if(i==0){
                answer+=sarray[i];
            }else{
                answer+=sarray[i]+" ";
            }
        }
        
        return answer;
    }
}
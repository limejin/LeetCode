class Solution {
    public int lengthOfLastWord(String s) {
        int lastIndex=s.length()-1;

        while(s.charAt(lastIndex)==' '){
            if(lastIndex!=0){
               lastIndex--;
            }else{
                break;
            }
        }

        int answer=0;

        while(s.charAt(lastIndex)!=' '){
            answer++;
            if(lastIndex!=0){
                lastIndex--;
            }else{
                break;
            }
        }

        return answer;
    }
}
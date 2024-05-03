// - 8 : 25
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];

        //String answer="";
        //int max=Math.min(first.length(), last.length());
        int max=first.length();
        int index=0;

        while(index<max){
            if(first.charAt(index)==last.charAt(index)){
                index++;
                //answer+=first.charAt(index);
            }else{
                break;
            }
        }

        return first.substring(0,index);
    }
}
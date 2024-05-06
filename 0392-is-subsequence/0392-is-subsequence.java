// 9 : 20
class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] c=s.toCharArray();
        int prev=-1;

        for(int i=0;i<c.length;i++){
            int temp=t.indexOf(c[i]);
            while(temp!=-1){
                if(prev<temp){
                    prev=temp;
                    break;
                }else{
                    temp=t.indexOf(c[i],temp+1);
                }
            }

            if(temp==-1) return false;
        }

        return true;
    }
}
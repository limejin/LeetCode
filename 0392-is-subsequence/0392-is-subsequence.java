// - 8 : 25
class Solution {
    public boolean isSubsequence(String s, String t) {
        // s를 배열로 바꾼 후 한 글자씩 순회하면서 t가 가지고 있는지 확인하기
        boolean answer = true;

        char[] sArray=s.toCharArray();

        int prevIndex=-1;
        for(int i=0;i<sArray.length;i++){
            int currentIndex=t.indexOf(sArray[i]);

            if(t.indexOf(sArray[i])!=-1){
                if(currentIndex>prevIndex){
                    prevIndex=currentIndex;
                    continue;
                }else{
                    while(true){
                        currentIndex=t.indexOf(sArray[i],currentIndex+1);
                        if(currentIndex==-1) {
                             answer=false; 
                            break;
                        }
                        else if(currentIndex>prevIndex){
                            prevIndex=currentIndex;
                            break;
                    }
                    }
                    if( !answer ) break;

                }
            }
            else {
                answer=false; 
                break;
            }
        } 

        return answer;
    }
}
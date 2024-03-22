class Solution {
    List<String> answer = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrack("", 0,0,n);

        return answer;
    }

    public void backtrack(String s, int open, int close,int half){
        if(s.length()==half*2){
            answer.add(s);
            return;
        }

        if(open<half){
            backtrack(s+"(", open+1, close, half);
        }

        if(close<open){
            backtrack(s+")",open, close+1, half);
        }
    }
}
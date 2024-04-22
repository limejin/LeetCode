// - 8 : 50
class Solution {
    public int maximalSquare(char[][] matrix) {
        // 1 0 1 0 0
        // 1 0 1 1 1
        // 1 1 1 2 2
        // 1 0 0 1 0
        int n=matrix.length;
        int m=matrix[0].length;
        int dp[][]=new int[n][m];
        int answer=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0||j==0){
                    if(matrix[i][j]=='1'){
                        dp[i][j]=1;
                    }
                }else{
                    if(matrix[i][j]=='1'){
                        dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
                    }
                }
                answer=Math.max(answer, dp[i][j]);
            }
        }
        return answer*answer;
    }
}
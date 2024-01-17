// - 9 : 15
class Solution {
    public void setZeroes(int[][] matrix) {

        int m=matrix.length;
        int n=matrix[0].length;
        
        Set<Integer> row=new HashSet<>();
        Set<Integer> col=new HashSet<>();

        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(matrix[r][c]==0){
                    row.add(r);
                    col.add(c);
                }
            }
        }

        Iterator<Integer> ri=row.iterator();
        while(ri.hasNext()){
            int tempr=ri.next();
            for(int c=0;c<n;c++){
                
                matrix[tempr][c]=0;
            }
        }

        Iterator<Integer> ci=col.iterator();
        while(ci.hasNext()){
             int tempc=ci.next();
            for(int r=0;r<m;r++){
                matrix[r][tempc]=0;
            }
        }
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int answer=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        while(!q.isEmpty()){
            int size=q.size();

            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                pq.offer(temp.val);

                if(temp.left!=null){
                    q.offer(temp.left);
                }

                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
        }

        while(pq.size() > 1){
            int first=pq.poll();
            int second=pq.peek();
            answer=Math.min(answer, second-first);
        }


        return answer;
    }
}
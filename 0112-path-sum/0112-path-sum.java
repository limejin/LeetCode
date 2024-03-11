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

 // - 9 : 20
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;

        Queue<TreeNode> q= new LinkedList<>();
        Queue<Integer> qq=new LinkedList<>();

        
        q.offer(root);

        while(!q.isEmpty()){
            int size=q.size();

            for(int i=0;i<size;i++){
                TreeNode cur=q.poll();

                if(cur.left!=null) {
                    cur.left.val+=cur.val;
                    q.offer(cur.left);
                }

                if(cur.right!=null) {
                    cur.right.val+=cur.val;
                    q.offer(cur.right);
                }

                if(cur.left==null&&cur.right==null){
                    qq.offer(cur.val);
                }
            }
        }

        boolean answer=false;
        while(!qq.isEmpty()){
            int sum=qq.poll();
            if(sum==targetSum) {
                answer=true;
                break;
            }else{
                answer=false;
            }
        }

        return answer;
    }
}
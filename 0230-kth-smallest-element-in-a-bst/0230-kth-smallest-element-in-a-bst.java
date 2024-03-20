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
    public int kthSmallest(TreeNode root, int k) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        ArrayList<Integer> al=new ArrayList<>();

        while(!q.isEmpty()){
            int size=q.size();

            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                al.add(temp.val);

                if(temp.left!=null){
                    q.offer(temp.left);
                }

                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
        }

        Collections.sort(al);

        return al.get(k-1);

    }
}
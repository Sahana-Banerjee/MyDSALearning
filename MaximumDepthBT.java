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
//A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
class Solution {
    int l=0, r=0, maxDepth=0;
    public int maxDepth(TreeNode root) {
        
        if(root == null)
            return 0;
        
        if(root.left != null){
          maxDepth(root.left);
          l++;
        }

        if(root.right != null){
            maxDepth(root.right);
            r++;
        }
        maxDepth = Math.max(l+1, r+1);
        return maxDepth;
    }
}

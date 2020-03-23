/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LowestComAncestor {
    
    TreeNode ans;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        this.ans=null;
        helper(root,p,q);
        return ans;
    }
    
    public boolean helper(TreeNode t,TreeNode p,TreeNode q){
        
        if(t!=null){
            
            int left=helper(t.left,p,q) ?1 : 0;
            int right=helper(t.right,p,q) ?1 : 0;
            
            int mid=(t == p || t == q) ? 1 : 0;
            
            if(left + right + mid == 2)
                ans=t;
            
            return (left+right+mid > 0);   
        }
        
        return false;
    }
}

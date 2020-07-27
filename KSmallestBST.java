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
class KSmallestBST {
    public int kthSmallest(TreeNode root, int k) {
        
        //Inorder traversal on a BST will give elements in ascending order
        List<Integer> elements = inorder(root, new ArrayList<Integer>());
        
        return elements.get(k-1);
        
    }
    
    public ArrayList<Integer> inorder(TreeNode t,ArrayList<Integer> arr){
        
        if(t == null)
            return arr;
        else{
            
            inorder(t.left, arr);
            arr.add(t.val);
            inorder(t.right, arr);
            return arr;
        }
    }
}

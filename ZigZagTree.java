/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class ZigZagTree {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        
        if(root == null)
            return result;
        
        dfs(root,0,result);
        return result;
        
    }
    
    public void dfs(TreeNode root,int level,List<List<Integer>> result){
        
        if(root != null){
            
            if(level >= result.size()){
                result.add(new LinkedList<Integer>());
            }
            
            if(level % 2 == 0){
                result.get(level).add(root.val);
            }
            else{
                result.get(level).add(0,root.val);
            }
            
            dfs(root.left,level+1,result);
            dfs(root.right,level+1,result);
        }
        return;
        
    }
}

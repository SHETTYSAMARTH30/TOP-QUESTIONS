/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {

    Queue<Integer> queue= new LinkedList<>();
    
    public NestedIterator(List<NestedInteger> nestedList) {
        
        helper(nestedList);
    }
    
    public void helper(List<NestedInteger> list){
        
        if(list == null)
            return;
        
        for(NestedInteger n: list){
            
            if(n.isInteger()){
                queue.add(n.getInteger());
            }
            else{
                helper(n.getList());
            }
        }
        
        //System.out.println(queue);
    }

    @Override
    public Integer next() {
        
        if(hasNext()){
            return queue.poll();
        }
        return -1;
    }

    @Override
    public boolean hasNext() {
        
        if(!queue.isEmpty())
            return true;
        else
            return false;
        
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */

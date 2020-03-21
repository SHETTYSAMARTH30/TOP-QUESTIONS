class KFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
        //Building min heap
        
        PriorityQueue<Integer> heap=new PriorityQueue<>((n1,n2) -> map.get(n1)-map.get(n2));
        
        for(int i:map.keySet()){
            heap.add(i);
            
            if(heap.size() > k)
                heap.poll();
        }
        
        List<Integer> list=new ArrayList<>();
        while(!heap.isEmpty()){
            list.add(heap.poll());
        }
        
        Collections.reverse(list);
        return list;
        
    }
}

class MeetingRooms2 {
    public int minMeetingRooms(int[][] intervals) {
        
        if(intervals.length==0)
            return 0;
        
        //Add the end time of meeting to heap, if the start time is after end time then we poll()
        PriorityQueue<Integer> heap=new PriorityQueue<>(intervals.length,
            new Comparator<Integer>(){
                    public int compare(Integer a, Integer b){
                        return a-b;
                    }});
        
        //Assign rooms to meetings which start first
        Arrays.sort(intervals, new Comparator<int[]>(){
                    public int compare(int a[],int b[]){
                        return a[0]-b[0];
                    }});
        
        heap.add(intervals[0][1]);
        
        for(int i=1; i<intervals.length;i++){
            
            if(intervals[i][0] >= heap.peek()){
                heap.poll();
            }
            heap.add(intervals[i][1]);
        }
        
        return heap.size();
        
    }
}

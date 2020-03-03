class CountAndSay {
    public String countAndSay(int n) {
        
        LinkedList<Integer> prevSeq=new LinkedList<>();
        
        prevSeq.add(1);
        prevSeq.add(-1);

        List<Integer> output= nextSequence(n,prevSeq);
        
        StringBuffer result=new StringBuffer();
        
        for(Integer i:output){
            
            result.append(Integer.toString(i));
        }
        
        return result.toString();
        
    }
    
    public LinkedList<Integer> nextSequence(int n,LinkedList<Integer> finalSeq){
        
        if(n <= 1){
            finalSeq.pollLast();
            return finalSeq;
        }
                
        LinkedList<Integer> nextSeq=new LinkedList<>();
        Integer prevDigit=null;
        Integer digitCnt=0;
        
        for(Integer i:finalSeq){
            
            if(prevDigit==null){
                prevDigit=i;
                digitCnt+=1;
            }
            else if(prevDigit==i){
                
                digitCnt+=1;
            }
            else{
                nextSeq.add(digitCnt);
                nextSeq.add(prevDigit);
                prevDigit=i;
                digitCnt=1;
            }
        }
        
        nextSeq.add(-1);
        return nextSequence(n-1,nextSeq);
        
    }
}

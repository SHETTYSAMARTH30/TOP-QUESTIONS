class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        
        List<String> list=new ArrayList<>();
        
        HashMap<Integer,String> map=new HashMap<Integer,String>(){
            {
                put(3,"Fizz");
                put(5,"Buzz");
            }
        };
        
        for(int i=1;i<=n;i++){
            
            String numStr = "";
            for(Integer k: map.keySet()){
                
                if(i%k == 0){
                    numStr+=map.get(k);
                }
                
            }
            
            if(numStr.equals("")){
                numStr+=Integer.toString(i);
            }
            
            list.add(numStr);
        }
        
        return list;
    }
}

class Search2DMatrixPt1 {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int nrow=matrix.length;
        if(nrow == 0)
            return false;
        
        int ncol=matrix[0].length;
        int left=0;
        int right=nrow*ncol-1;
        int pivotId,pivotElement;
        
        while(left <= right){
            
            pivotId = (left+right)/2;
            pivotElement = matrix[pivotId / ncol][pivotId % ncol];
            
            if(target == pivotElement)
                return true;
            
            else{
                
                if(pivotElement > target){
                    right=pivotId-1;
             }
            else if(pivotElement < target){
                left=pivotId+1;
            }
        }
                
        }
        
        return false;
        
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        while(i<matrix.length){
            
            int j=matrix[i].length - 1;
            while(j>=0){
                
                if(matrix[i][j] == target){
                    return true;
                }else if(matrix[i][j] > target){
                    j--;
                    if(j==-1){
                        return false;
                    }
                }else if(matrix[i][j] < target){
                    i++;
                    break;
                }
                
                
                
            }
            
            
        }
        return false;
    }
}
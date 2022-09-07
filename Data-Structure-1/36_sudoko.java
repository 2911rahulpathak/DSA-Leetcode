class Solution {
    public boolean isValidSudoku(char[][] board) {
        // creating the hash set
        HashSet<String> hset = new HashSet<>();
        
        // populating and checking the data
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                
                char number=board[i][j];
                if(number != '.'){
                    
                    String str1=number + " in row "+i;
                    String str2=number + " in column "+j;
                    String str3 = number + " in block "+ i/3 + " - "+j/3;
                    
                    if(hset.contains(str1) || hset.contains(str2) || hset.contains(str3)){
                        return false;
                    }
                    
                    hset.add(str1);
                    hset.add(str2);
                    hset.add(str3);
                }
            }
        }
        
        return true;
        
    }
}
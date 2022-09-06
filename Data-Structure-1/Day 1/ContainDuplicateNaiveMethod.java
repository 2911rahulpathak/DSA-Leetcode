class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=1;j<nums.length;j++)
            {
    
                if(i == j)
                {
                    return true;
                }
                
            }
            
        }
       return false;
        
    
    }
}
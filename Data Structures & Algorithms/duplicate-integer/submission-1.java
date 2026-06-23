class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        boolean result = false;
        for(int i=0;i<=nums.length-2;i++)
        {
            for(int j=i+1;j<=nums.length-1;j++)
             {
                if(nums[j]==nums[i])
                {
                    result=true;
                    break;
                
                }
             }
        }
        return result;
        
    }
}
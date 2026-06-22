class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] arr = new int[2* nums.length];
        int j=0;
        for(int i=0;i<arr.length; i++)
        {
            if(i<nums.length)
            {
               arr[i]= nums[i];
            }
            else
            {
               arr[i]=nums[j];
               j++;
            }
        
        }
        return arr;

    }
}
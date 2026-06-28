class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer>hm = new HashMap<>();
       int []arr = new int[2];

       hm.put(nums[0],0);

        for(int i =1;i<nums.length;i++) {
            if(hm.containsKey(target-nums[i])) {
                arr[0]=hm.get(target-nums[i]);
                arr[1]=i;
            }
            else {
                hm.put(nums[i],i);
            }
        }
        return arr;



    //    for(int i=0;i<nums.length;i++)
    //    {

    //       hm.put(nums[i],i);
    //    }
    //    for(int i=0;i<nums.length;i++)
    //    {
    //      int result = target-nums[i];
    //      if(hm.containsKey(result)&& hm.get(result)!=i)
    //      {
    //          arr[0]=i;
    //          arr[1]=hm.get(result);
    //          break;
    //         //  return arr; 
    //      }
    //    }
    //    return arr; 
    }
}


class Solution {
    public boolean hasDuplicate(int[] nums) {
       //boolean result = False;
       HashMap<Integer,Integer>map = new HashMap<>();
       for(int n :nums)
       {
            if(map.containsKey(n))
            {
              return true;
            }
            else
            {
              map.put(n,n);
            }
       } 
       return false;
    }
}
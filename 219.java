class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        
        for(int i =0; i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i], i);
            }
            else{
                int PastIndex = hm.get(nums[i]);    //the value in hashmap where it was previously seen
                if(Math.abs(PastIndex-i)<=k){        //pastIndex - i means subtracting previously seen value and current for 
                                                    //loop index where we are now looking at the number
                    return true;
                }
                else{
                    hm.put(nums[i], i);
                }
            }
  
        }
        return false;
    }
}

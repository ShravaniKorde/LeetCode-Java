class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length/2) {
                return entry.getKey();
            }
        }
            return 0;
    }

}

//------------------------------------------------2nd soln------------------------------------------------------
class Solution {
    public int majorityElement(int[] nums) {

        int cand = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(count == 0){
                cand = nums[i];
            }
            if(cand == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return cand;
    }   
}
        
        

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        if(nums == null || nums.length < 3) return new ArrayList<>();

        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        for(int i = 0; i<nums.length - 2; i++){  //fix first ele and find other two ele
            int left = i+1;
            int right = nums.length - 1;

            while(left<right){
                int sum = nums[i]+ nums[left]+nums[right];

                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));  //add the set and move to find other triplets
                    left++;
                    right--;
                }else if(sum<0){
                    left ++;

                }else{
                    right--;
                }
            }
    
        }
        return new ArrayList<>(result);
    }
}

-------------------------------2nd soln------------------------
    class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0; i<n-2; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;

            int left = i+1;
            int right= n-1;
            int sum = -nums[i];

            while(left < right){
                int s = nums[left] + nums[right];
                if(s == sum){
                     result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                
                while(left<n && nums[left]==nums[left-1])
                left++;
                while(right>=0 && nums[right]==nums[right+1])
                right--;
            }
            else if(s<sum){
            left++;
            }
            else {
                right--;
            }
        }
    }
    return result;
    }
}


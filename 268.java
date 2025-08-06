class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];  //find sum of all elements present in given array
        }
        int actualsum=(nums.length*(nums.length+1))/2;  //formula to find actualsum n*(n+1)/2  [actual sum means the sum along with the missing number]
        int missingnum=actualsum-sum;
        return missingnum;
    }
}

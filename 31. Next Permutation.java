class Solution {
    public void swap(int[]nums,int k, int l){
        int temp=nums[k];
        nums[k]=nums[l];
        nums[l]=temp;

    }

     public void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
     }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int k=-1, l=-1;
        for(k=n-2;k>=0;k--){
            if(nums[k]<nums[k+1]){
                break;
            }
        }
        if(k<0){
            reverse(nums, 0);
        }else{
            for(l=n-1;l>k;l--){
                if(nums[l]>nums[k]){
                    break;
                }
            }
            swap(nums, k, l);
            reverse(nums, k + 1);
        }
    }
}

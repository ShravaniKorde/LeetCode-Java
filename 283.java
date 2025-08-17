// class Solution {
//     public void moveZeroes(int[] nums) {

//         int count = 0;

//         for(int i=0;i<nums.length;i++){
//             if(nums[i]!=0){
//                 nums[count++]=nums[i];
//             }
//         }
//         while(count<nums.length){
//             nums[count++]=0;
//         }
        
//     }
// }
//------------------------second approach-------------
class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }        
    }
}

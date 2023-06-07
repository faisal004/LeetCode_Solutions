class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        int []ans = new int[2];

        int i = 0; 
        int j = i+1;

        while(i<j) {
           if(nums[i]+nums[j]==target){
               ans[0] = i;
               ans[1] = j;
               break;
           } else if(j==n-1) {
               i++;
               j = i+1;
           } else {
               j++;
           }
        }
        return ans;
    }
}
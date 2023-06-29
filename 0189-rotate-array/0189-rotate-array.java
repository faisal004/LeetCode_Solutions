class Solution {
    public void rotate(int[] nums, int k) {
        
    k %= nums.length;
    reverse(nums, 0, nums.length-1);  // reverse the whole array
    reverse(nums, 0, k-1);  // reverse the first part
    reverse(nums, k, nums.length-1);  // reverse the second part
    }

    public void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
    }
}
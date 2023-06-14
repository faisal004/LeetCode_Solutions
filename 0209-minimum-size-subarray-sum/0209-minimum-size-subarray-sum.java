class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int total=0;
        int r=0;
        int res=nums.length+1;

        while(r<nums.length){
            total+=nums[r];
            while(total>=target){
                res=Math.min(res,r-l+1);
                total-=nums[l];
                l+=1;
            }
            r+=1;
        }
        if(res==nums.length+1){
            return 0;
        }else{
            return res;
        }
        
    }
}
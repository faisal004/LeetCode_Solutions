class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int Streak=1;
        int currentStreak=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                if(nums[i]==nums[i-1]+1){
                    currentStreak++;
                }else{
                    Streak=Math.max(Streak,currentStreak);
                    currentStreak=1;
                }

            }
        }
        return Math.max(Streak,currentStreak);

        
    }
}
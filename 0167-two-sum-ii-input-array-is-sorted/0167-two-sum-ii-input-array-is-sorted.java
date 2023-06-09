class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int first=0;
        int last=numbers.length-1;
        int[] ans= new int[2];
        while(first<=last){
            if(numbers[first]+numbers[last]==target){
                ans[0]=first+1;
                ans[1]=last+1;
                return ans;

            }else{
                if(numbers[first]+numbers[last]<target){
                    first++;
                }else{
                    last--;
                }
            }
            
        }
        return ans;
        
    }
}
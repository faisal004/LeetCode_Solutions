class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> max= new HashMap<>();
        for(int num:nums){
            max.put(num,max.getOrDefault(num,0)+1);
            if(max.get(num)>nums.length/2){
                return num;
            }
        }
         return -1;
    }
   
    
}
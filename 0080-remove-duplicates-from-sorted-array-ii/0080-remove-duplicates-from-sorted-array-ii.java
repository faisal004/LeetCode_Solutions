class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> unique= new HashMap<>();
        int i=0;
       
        for(int num : nums){
            
                if(!unique.containsKey(num) || unique.get(num)<2){
                unique.put(num,unique.getOrDefault(num,0)+1);
                nums[i]=num;
                i++;
                
            

            }
            
        }

        return i;
        
    }
}
import java.util.HashSet;

class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> unique = new HashSet<>();
        int i = 0;
        for (int num : nums) {
            if (!unique.contains(num)) {
                unique.add(num);
                nums[i] = num;
                i++;
            }
        }
        return i;
    }
}

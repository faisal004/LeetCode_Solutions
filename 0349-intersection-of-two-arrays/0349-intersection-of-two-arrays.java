

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int left = 0;
        int right = 0;
        ArrayList<Integer> output = new ArrayList<>();

        while (left < nums1.length && right < nums2.length) {
            if (nums1[left] == nums2[right]) {
                output.add(nums1[left]);
                left++;
                right++;
            } else if (nums1[left] < nums2[right]) {
                left++;
            } else {
                right++;
            }
        }

        
        HashSet<Integer> uniqueSet = new HashSet<>(output);

      
        int[] result = new int[uniqueSet.size()];
        int i = 0;
        for (int num : uniqueSet) {
            result[i++] = num;
        }

        return result;
    }
}

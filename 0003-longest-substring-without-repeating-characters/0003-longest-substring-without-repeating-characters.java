class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> unique = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxLength = 0;
        
        while (right < s.length()) {
            if (unique.contains(s.charAt(right))) {
                unique.remove(s.charAt(left));
                left++;
            } else {
                unique.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            }
        }
        
        return maxLength;
    }
}

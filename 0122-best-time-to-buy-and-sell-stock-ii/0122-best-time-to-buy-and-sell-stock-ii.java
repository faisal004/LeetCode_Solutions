class Solution {
    public int maxProfit(int[] prices) {
        
        int right = 1;
        int result = 0;
        
        while (right < prices.length) {
            if (prices[right] > prices[right - 1]) {
                result += prices[right] - prices[right - 1];
            }
            
            right++;
        }
        
        return result;
    }
}

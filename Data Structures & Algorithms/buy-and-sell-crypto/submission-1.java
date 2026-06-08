class Solution {
    public int maxProfit(int[] prices) {
        
        int max = 0;
        int len = prices.length;
        int l = 0;
        int r = 1;

        while (r < len) {
            
            if (prices[r] > prices[l]) {
                if (prices[r] - prices[l] > max) {
                    max = prices[r] - prices[l];
                }
            } else {
                l = r;
            }
            r++;
        }

        return max;


    }
}

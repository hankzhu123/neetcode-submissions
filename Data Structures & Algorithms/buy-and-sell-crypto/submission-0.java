class Solution {
    public int maxProfit(int[] prices) {
        
        int max = 0;
        int len = prices.length;

        for (int i=0; i<len-1; i++) {
            for (int z=i; z<len; z++) {
                if (prices[z] - prices[i] > max) {
                    max = prices[z] - prices[i];
                }
            }
        }

        return max;


    }
}

class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] res = new int[nums.length*2];
        int len = nums.length;

        for (int i=0; i<res.length; i++) {
            int p = 0;
            if (i >= len) {
                p = i - len;
                res[i] = nums[p];
            } else {

                res[i] = nums[i];
            }
        }

        return res;

    }
}
class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        
        int l = 0;
        int r = len-1;

        while (l <= r) {
            int mid = (r + l) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (target < nums[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}

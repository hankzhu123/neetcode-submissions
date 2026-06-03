class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> li = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (int i=0; i<k; i++) {
            int temp = Integer.MIN_VALUE;
            int tempK = 0;
            for (int p : map.keySet()) {
                if (map.get(p) > temp) {
                    temp = map.get(p);
                    tempK = p;
                }
                System.out.println("Key: " + p + ", Value: " + map.get(p));
            }
            li.add(tempK);
            map.remove(tempK);

        }

        int[] output = new int[li.size()];
        for (int i=0; i<li.size(); i++) {
            output[i] = li.get(i);
        }

        return output;
        
    }
}

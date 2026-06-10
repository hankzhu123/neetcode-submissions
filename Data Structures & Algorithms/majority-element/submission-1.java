class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int resV = 0;
        int resK = 0;
        for (int num : nums) {

            if (map.containsKey(num)) {
                int tempV = map.get(num);
                map.put(num, tempV + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (int i : map.keySet()) {
            if (map.get(i) > resV) {
                resV = map.get(i);
                resK = i;
            }
            System.out.println(i + " -> " + map.get(i));
        }

        return resK;
    }
}
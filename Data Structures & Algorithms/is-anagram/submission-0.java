class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> h1 = new HashMap<>();

        for (int i=0; i<s.length(); i++){
            if (h1.containsKey(s.charAt(i))) {
                h1.computeIfPresent(s.charAt(i), (k, v) -> v+1);
            } else {
                h1.put(s.charAt(i), 1);
            }
        }

        for (char k : h1.keySet()) {
            System.out.println("Key: " + k + ", Value: " + h1.get(k));
            // if (h1.get(k) != 0) {
            //     return false;
            // }
        }

        System.out.println("----");

        for (int i=0; i<t.length(); i++){
            if (h1.containsKey(t.charAt(i))) {
                h1.computeIfPresent(t.charAt(i), (k, v) -> v-1);
            } else {
                return false;
            }
        } 

        for (char k : h1.keySet()) {
            System.out.println("Key: " + k + ", Value: " + h1.get(k));
            if (h1.get(k) != 0) {
                return false;
            }
        }
        return true;
        
    }
}

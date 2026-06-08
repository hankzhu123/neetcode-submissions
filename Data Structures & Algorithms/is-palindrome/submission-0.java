class Solution {
    public boolean isPalindrome(String s) {
        
        String c = s.replaceAll("[^a-zA-Z0-9]", "");
        String clean = c.toLowerCase();
        int len = clean.length();

        if (len == 0) {
            return true;
        }

        int p1 = 0;
        int p2 = len-1;

        while(p1 < p2) {
            if (clean.charAt(p1) == clean.charAt(p2)) {
                p1++;
                p2--;
            } else {
                return false;
            }
        }

        return true;
    }
}

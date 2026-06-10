class Solution {
    public void reverseString(char[] s) {
        
        int l = 0;
        int r = s.length-1;
        rec(s,l,r);
    }
    public char[] rec(char[] s, int l, int r) {

        if (l >= r) {
            return s;
        }
        if (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
        }
        return rec(s, l+1, r-1);
    }
}
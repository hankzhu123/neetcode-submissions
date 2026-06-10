class Solution {
    public void reverseString(char[] s) {
        
        int len = s.length;
        int p1 = 0;
        int p2 = len-1;

        while (p1<p2) {
            char temp = 'a';
            temp = s[p1];
            s[p1] = s[p2];
            s[p2] = temp;

            p1++;
            p2--;
            
        }

        
    }
}
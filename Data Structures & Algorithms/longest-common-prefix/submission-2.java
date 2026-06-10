class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String res = "";
        int len = strs.length;
        int tempLen = Integer.MAX_VALUE;
        int sIndex = 0;
        for (int i=0; i<strs.length; i++) {
            if (strs[i].length() < tempLen) {
                tempLen = strs[i].length();
                sIndex = i;
            }
        }


        String firstS = strs[sIndex];

        

        for (int i=0; i<firstS.length(); i++) {
            char temp = firstS.charAt(i);
            for (int p=1; p<len; p++) {
                if (strs[p].isEmpty()) {
                    return res;
                }
                if (temp != strs[p].charAt(i)) {
                    return res;
                } 
            }
            
            res = res + firstS.charAt(i);
            

        }

        return res;
    }
}
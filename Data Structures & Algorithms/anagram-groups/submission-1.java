class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i=0; i<strs.length; i++) {
            String k = sortWord(strs[i]);
            if (map.containsKey(k)) {
                List<String> temp = map.get(k);
                temp.add(strs[i]);
                map.put(k, temp);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                map.put(k, temp);
            }
        }

        return new ArrayList<>(map.values());
        
    }

    public String sortWord(String word) {
        // convert to char array
        char[] charArray = word.toCharArray();

        // sort the array
        Arrays.sort(charArray);

        // convert it back to string 
        String sortedWord = new String(charArray);

        return sortedWord;
    }

    
}
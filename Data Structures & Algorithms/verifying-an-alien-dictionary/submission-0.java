class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> m = new HashMap<>();

        for(int i=0; i < 26; i++) m.put(order.charAt(i), i);
        for(int i=0; i < words.length-1; i++) {
            String word1 = words[i];
            String word2 = words[i+1];

            for(int j=0; j < word1.length(); j++) {
                if(j == word2.length()) return false;
                
                if(word1.charAt(j) != word2.charAt(j)) {
                    if(m.get(word1.charAt(j)) > m.get(word2.charAt(j))) return false;
                    break;
                }
            }
        }

        return true;
    }
}
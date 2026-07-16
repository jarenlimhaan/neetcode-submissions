class Solution {
    public boolean isAnagram(String s, String t) {
        
        int n1 = s.length();
        int n2 = t.length();

        if(n1 != n2) return false;
        
        int[] c = new int[26];

        for(int i=0; i < n1; i++) {
            c[s.charAt(i) - 'a']++;
            c[t.charAt(i) - 'a']--;
        }

        for (int val : c) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}

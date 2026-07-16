class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> h = new HashSet<>();
        int res = 0;

        int l = 0;

        for(int r=0; r < s.length(); r++) {
            
            char curr = s.charAt(r);
            while(h.contains(curr)) {
                h.remove(s.charAt(l));
                l++;
            }
            
            res = Math.max(res, r - l +1);
            h.add(s.charAt(r));
        }

        return res;
    }
}

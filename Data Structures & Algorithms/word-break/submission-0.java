class Solution {

    private Boolean[] memo;

    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> wordSet = new HashSet<>(wordDict);
        memo = new Boolean[s.length()];

        return dfs(s, wordSet, 0);
    }

    private boolean dfs(String s, HashSet<String> wordSet, int i) {
        if(i == s.length()) return true;

        if(memo[i] != null) return memo[i];

        for(int j=i; j < s.length(); j++) {
            if (wordSet.contains(s.substring(i, j + 1))) {
                if (dfs(s, wordSet, j + 1)) {
                    memo[i] = true;
                    return true;
                }
            }
        }

        memo[i] = false;
        return false;
    }
}

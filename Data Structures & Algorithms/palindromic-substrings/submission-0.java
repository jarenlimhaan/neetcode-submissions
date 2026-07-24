class Solution {
    public int countSubstrings(String s) {
        int n = s.length();

        boolean[][] dp = new boolean[n][n];
        int c = 0;

        for(int l=1; l <= n; l++) {
            for(int start=0; start <= n - l; start++) {
                int end = start + l -1;
                if(s.charAt(start) == s.charAt(end) && (l <= 2 || dp[start+1][end-1])) {
                    dp[start][end] = true;
                    c++;
                }
            }
        }

        return c;
    }
}

class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int resStart = 0;
        int resLength = 0;
        boolean[][] dp = new boolean[n][n];

        for(int l = 1; l <= n; l++) {
            for(int start = 0; start <= n-l; start++) {
                
                int end = start + l - 1;
                if(s.charAt(start) == s.charAt(end) && (l <=2 || dp[start+1][end-1])) {
                    dp[start][end]= true;
                    if(l > resLength) {
                        resLength = l;
                        resStart = start;
                    }
                }
            }
        }

        return s.substring(resStart, resStart + resLength);
    }
}

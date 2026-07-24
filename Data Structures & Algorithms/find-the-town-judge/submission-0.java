class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustScores = new int[n + 1]; 

        for (int[] t : trust) {
            int tracer = t[0]; 
            int target = t[1]; 

            trustScores[tracer]--; 
            trustScores[target]++; 
        }

        for (int i = 1; i <= n; i++) {
            if (trustScores[i] == n - 1) {
                return i; 
            }
        }

        return -1;
    }
}
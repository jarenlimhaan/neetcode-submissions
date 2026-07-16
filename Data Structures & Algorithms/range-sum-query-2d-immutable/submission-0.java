public class NumMatrix {

    private int[][] dp;

    public NumMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        
        int R = matrix.length;
        int C = matrix[0].length;
        // 1-padded matrix: size (R + 1) x (C + 1)
        this.dp = new int[R + 1][C + 1];

        // Build the prefix sum matrix
        for (int r = 1; r <= R; r++) {
            for (int c = 1; c <= C; c++) {
                this.dp[r][c] = matrix[r - 1][c - 1] 
                              + this.dp[r - 1][c] 
                              + this.dp[r][c - 1] 
                              - this.dp[r - 1][c - 1];
            }
        }
    }

    public int sumRegion(int r1, int c1, int r2, int c2) {
        return this.dp[r2 + 1][c2 + 1] 
             - this.dp[r1][c2 + 1] 
             - this.dp[r2 + 1][c1] 
             + this.dp[r1][c1];
    }
}
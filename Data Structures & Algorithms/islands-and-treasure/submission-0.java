class Solution {

    private int[][] directions = {{1, 0}, {-1, 0},
                                  {0, 1}, {0, -1}};
    private int INF = 2147483647;
    private int ROWS, COLS;

    public void islandsAndTreasure(int[][] grid) {
        
        ROWS = grid.length;
        COLS = grid[0].length;

        for(int r=0; r < ROWS; r++) {
            for(int c=0; c < COLS; c++) {
                if(grid[r][c] == INF) grid[r][c] = bfs(grid, r, c);
            }
        }

    }

    private int bfs(int[][] grid, int r, int c) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r, c});
        boolean[][] visited = new boolean[ROWS][COLS];
        int steps = 0;
        visited[r][c] = true;

        while(!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int row = curr[0], col = curr[1];
                if(grid[row][col] == 0) return steps;
                for(int[] dir: directions) {
                    int nr = row + dir[0], nc = col + dir[1];
                    if(nr >= 0 && nc >= 0 && nr < ROWS && nc < COLS && !visited[nr][nc] && grid[nr][nc] != -1) {
                        visited[nr][nc] = true;
                        q.add(new int[]{nr, nc});
                    }
                }
            }  

            steps++;
        }

        return INF;
    }
}

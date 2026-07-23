class Solution {

    boolean[][] visited;

    public int islandPerimeter(int[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        visited = new boolean[ROWS][COLS];
        for(int r=0; r < ROWS; r++) {
            for(int c=0; c < COLS; c++) {
                if(grid[r][c] == 1) return dfs(grid, r,c);
            }
        }
        return 0;
    }

    public int dfs(int[][] grid, int r, int c) {

        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0) return 1;

        if(visited[r][c]) return 0;
        
        visited[r][c] = true;
        return dfs(grid, r+1, c) + dfs(grid, r-1,c) + dfs(grid, r, c+1) + dfs(grid, r,c-1);
    }
}
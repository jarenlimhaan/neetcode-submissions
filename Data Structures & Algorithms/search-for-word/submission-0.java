class Solution {

    boolean[][] visited;

    public boolean exist(char[][] board, String word) {

        int r = board.length;
        int c = board[0].length;
        visited = new boolean[r][c];

        for(int i=0; i < r; i++) {
            for(int j=0; j < c; j++) {
                if(backTrack(board, word, i, j, 0)) return true;
            }
        }

        return false;
    }

    public boolean backTrack(char[][] board, String word, int r, int c, int index) {

        if(index == word.length()) return true;

        if(r < 0 || c < 0 || r >= board.length ||c >= board[0].length || board[r][c] != word.charAt(index) || visited[r][c]) return false;

        visited[r][c] = true;
        
        boolean res = backTrack(board, word, r+1, c, index+1) || backTrack(board, word, r-1, c, index+1) || backTrack(board, word, r, c+1, index+1) || backTrack(board, word, r, c-1, index+1);

        visited[r][c] = false;

        return res;
    }
}

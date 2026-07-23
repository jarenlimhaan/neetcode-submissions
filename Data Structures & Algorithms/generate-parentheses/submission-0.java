class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> res = new ArrayList<>();
        StringBuilder curr = new StringBuilder();
        backTrack(0,0, n, res, curr);
        return res;
    }

    private void backTrack(int openingParen, int closingParen, int n, List<String> res, StringBuilder sb) {

        if(openingParen == closingParen && openingParen == n) {
            res.add(sb.toString());
            return;
        }

        if(openingParen < n) {
            sb.append("(");
            backTrack(openingParen+1, closingParen, n, res, sb);
            sb.deleteCharAt(sb.length() - 1);
        } 
        if(closingParen < openingParen) {
            sb.append(")");
            backTrack(openingParen, closingParen+1, n, res, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}

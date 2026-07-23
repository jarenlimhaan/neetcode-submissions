class Solution {
    
    private String[] digitToChar = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "qprs", "tuv", "wxyz"
        };
    
    public List<String> letterCombinations(String digits) {

       List<String> res = new ArrayList<>();

        if (digits.isEmpty()) return res;

       backTrack(digits, 0, res, "");

       return res;
    }

    private void  backTrack(String digits, int index, List<String> res, String curr) {

        if(index == digits.length()) {
            res.add(curr);
            return;
        }

        String chars = digitToChar[digits.charAt(index) - '0'];
        for(char c: chars.toCharArray()) {
            backTrack(digits, index+1, res, curr + c);
        }

    }
}

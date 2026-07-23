class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> curr = new ArrayList<>();

        backTrack(s, 0, res, curr);

        return res;
    }

    private void backTrack(String s, int index, List<List<String>> res, List<String> curr) {
        if(index >= s.length()) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i=index; i < s.length(); i++) {
            if(isPalindrome(s, index, i)) {
                curr.add(s.substring(index, i+1));
                backTrack(s, i+1, res, curr);
                curr.remove(curr.size() - 1);
            }


        }

    }

    private boolean isPalindrome(String s, int l, int r) {
        while(l < r) {
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }

        return true;
    }
}

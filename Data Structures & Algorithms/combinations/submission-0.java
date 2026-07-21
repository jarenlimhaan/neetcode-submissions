class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backTrack(n+1, 1, k, res, curr);

        return res;
    }

    public void backTrack(int n, int index, int k, List<List<Integer>> res, List<Integer> curr) {
        
        if(curr.size() == k) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i=index; i < n; i++) {
            curr.add(i);
            backTrack(n, i+1, k, res, curr);
            curr.remove(curr.size() - 1);
        }
    }
}
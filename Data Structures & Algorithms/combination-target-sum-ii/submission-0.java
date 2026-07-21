class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backTrack(candidates, target, 0, res, curr);

        return res;
    }

    public void backTrack(int[] candidates, int target, int index,  List<List<Integer>> res, List<Integer> curr) {
        
        if(target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i=index; i < candidates.length; i++) {

            if (candidates[i] > target) break;

            if(i > index && candidates[i] == candidates[i-1]) continue;

            curr.add(candidates[i]);
            backTrack(candidates, target-candidates[i], i+1, res, curr);
            curr.remove(curr.size() - 1);
        }
    }
}

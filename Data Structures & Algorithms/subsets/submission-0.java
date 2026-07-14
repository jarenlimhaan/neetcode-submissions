class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        backTrack(nums, 0, res, curr);

        return res;
    }

    private void backTrack(int[] nums, int i, List<List<Integer>> res, List<Integer> curr) {
    
        if(i >= nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[i]);
        backTrack(nums, i+1, res, curr);
        curr.remove(curr.size() - 1);
        backTrack(nums, i+1, res, curr);
    
    }
}

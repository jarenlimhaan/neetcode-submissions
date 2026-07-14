class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        backTrack(nums, 0, target, res, curr);

        return res;
    }

    private void backTrack(int[] nums, int i, int target, List<List<Integer>> res, List<Integer> curr) {
        if(target < 0 || i > nums.length-1) return;

        if(target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[i]);
        backTrack(nums, i, target-nums[i], res, curr);
        curr.remove(curr.size() -1);
        backTrack(nums, i+1, target, res, curr);
    }
}

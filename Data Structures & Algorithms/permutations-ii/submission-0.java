class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] selected = new boolean[nums.length];
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        backTrack(nums, selected, res, curr);
        return res;
    }

    private void backTrack(int[] nums, boolean[] selected, List<List<Integer>> res, List<Integer> curr) {

        if(curr.size() == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0; i < nums.length; i++) {

            if(selected[i]) continue;
            
            if (i > 0 && nums[i] == nums[i - 1] && !selected[i - 1]) continue;
            curr.add(nums[i]);
            selected[i] = true;
            backTrack(nums, selected, res, curr);
            curr.remove(curr.size() - 1);
            selected[i] = false;
        }

    }
}
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        backTrack(nums, 0, res, curr);
        return res;
    }

    private void backTrack(int[] nums, int index, List<List<Integer>> res, List<Integer> curr) {
        res.add(new ArrayList<>(curr));
        
        for(int i=index; i < nums.length; i++) {
            if(i > index && nums[i] == nums[i-1]) continue;
            curr.add(nums[i]);
            backTrack(nums, i+1, res, curr);
            curr.remove(curr.size() - 1);
        }
    }
}

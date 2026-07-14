class Solution {
    public int subsetXORSum(int[] nums) {
        return recurse(nums, 0, 0);
    }

    private int recurse(int[] nums, int i, int curr) {

        if(i > nums.length-1) return curr;

        return recurse(nums, i+1, curr ^ nums[i]) + recurse(nums, i+1, curr);

    }
}
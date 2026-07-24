class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0], res = nums[0];

        for(int i = 1; i < nums.length; i++) {
            currSum = Math.max(currSum + nums[i], nums[i]);
            res = Math.max(currSum, res);
        }

        return res;
    }
}

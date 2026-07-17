class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int res = Integer.MAX_VALUE, l = 0;
        int runningSum = 0;

        for(int r=0; r < nums.length; r++) {
            runningSum += nums[r];
            while(runningSum >= target) {
                res = Math.min(res, r - l +1);
                runningSum -= nums[l++];
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
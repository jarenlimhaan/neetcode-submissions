class Solution {
    public int majorityElement(int[] nums) {
        
        int res = 0, c = 0;

        for(int i= 0; i < nums.length; i++) {

            if(c == 0) {
                res = nums[i];
            }

            c += (nums[i] == res) ? 1 : -1;
        }

        return res;
    }
}
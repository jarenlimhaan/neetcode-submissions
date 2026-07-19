class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        int missing = 1;
        for(int i: nums) {
            if(i > 0 && missing == i) {
                missing++;
            } 
            
        }
        return missing;
    }
}
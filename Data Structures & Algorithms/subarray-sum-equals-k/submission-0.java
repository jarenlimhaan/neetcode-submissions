class Solution {
    public int subarraySum(int[] nums, int k) {
        int c = 0;
        Map<Integer, Integer> h = new HashMap<>();
        int currSum = 0;

        h.put(0, 1);

        for(int i=0; i < nums.length; i++) {
            currSum += nums[i];
            if(h.containsKey(currSum - k)) {
                c += h.get(currSum - k);
            }

            h.put(currSum, h.getOrDefault(currSum, 0) + 1);
        }

        return c;
    }
}
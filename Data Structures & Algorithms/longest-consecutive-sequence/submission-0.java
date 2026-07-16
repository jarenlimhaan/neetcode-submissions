class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set<Integer> h = new HashSet<>();

        for(int i: nums) h.add(i);

        for(int num: nums) {
            if(!h.contains(num - 1)) {
                int length = 1;
                while(h.contains(num + length)) {
                    length++;
                }

                res = Math.max(res, length);
            }
        }

        return res;
        
    }
}

class Solution {
    public int trap(int[] heights) {
        
        int l = 0, r = heights.length - 1;
        int leftMax = 0, rightMax = 0;
        int totalWater = 0;

        while(l < r) {
            if(heights[l] < heights[r]) {
                
                if(heights[l] >= leftMax) {
                    leftMax = heights[l];
                } else {
                    totalWater += (leftMax - heights[l]);
                }
                l++;
            } else {
                if(heights[r] >= rightMax) {
                    rightMax = heights[r];
                } else {
                    totalWater += (rightMax - heights[r]);
                }
                r--;
            }
        }

        return totalWater;
    }
}

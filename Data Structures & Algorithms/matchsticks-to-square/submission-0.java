class Solution {
    public boolean makesquare(int[] matchsticks) {
        int totalLength = Arrays.stream(matchsticks).sum();
        if (totalLength % 4 != 0) return false;

        int length = totalLength / 4;
        int[] sides = new int[4];
        Arrays.sort(matchsticks);
        reverse(matchsticks);

        return dfs(matchsticks, sides, 0, length);
    }

    private void reverse(int[] matchsticks) {
        for (int i = 0, j = matchsticks.length - 1; i < j; i++, j--) {
            int temp = matchsticks[i];
            matchsticks[i] = matchsticks[j];
            matchsticks[j] = temp;
        }
    }

    private boolean dfs(int[] matchsticks, int[] sides, int index, int target) {

        if(index == matchsticks.length) {
            return true;
        }

        int currStick = matchsticks[index];

        for(int i=0; i < 4; i++) {
            if(sides[i] + currStick <= target) {
                sides[i] += currStick;
                if(dfs(matchsticks, sides, index+1, target)) return true;
                sides[i] -= currStick; 
            }
        }

        return false;
    }
}
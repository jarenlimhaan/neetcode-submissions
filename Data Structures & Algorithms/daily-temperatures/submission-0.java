class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Arrays.fill(res, 0);

        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0; i < temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                res[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }

        return res;
    }
}

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> st = new ArrayDeque<>();

        for(int ast: asteroids) {
            boolean exploded = false;

            while(!st.isEmpty() && st.peek() > 0 && ast < 0) {
                int top = st.peek();
                if(top < Math.abs(ast)) {
                    st.pop();
                } 
                else if(top == Math.abs(ast)) {
                    exploded = true;
                    st.pop();
                    break;
                }
                else {
                    exploded = true;
                    break;
                }
            }

            if(!exploded) st.push(ast);
        }

        int[] result = new int[st.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }


        return result;
    }
}
class Solution {
    public boolean isValid(String s) {
        List<Character> st = new ArrayList<>();
        
        Map<Character, Character> m = new HashMap<>();
        m.put('}', '{');
        m.put(')', '(');
        m.put(']', '[');
        for(char c: s.toCharArray()){
            if(st.size() > 0 && m.containsKey(c)) {
                if(st.remove(st.size() - 1) != m.get(c)) return false;
            } else {
                st.add(c);
            }
        }

        return st.size() == 0;
    }
}
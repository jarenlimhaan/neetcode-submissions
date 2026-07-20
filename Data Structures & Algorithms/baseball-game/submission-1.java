class Solution {
    public int calPoints(String[] operations) {
        List<Integer> opr = new ArrayList<>();
        int res = 0;

        for (String c : operations) {
            if (c.equals("+")) {
                int add = opr.get(opr.size() - 1) + opr.get(opr.size() - 2);
                res += add;
                opr.add(add);
            } else if (c.equals("D")) {
                int add = 2 * opr.get(opr.size() - 1);
                res += add;
                opr.add(add);
            } else if (c.equals("C")) {
                res -= opr.remove(opr.size() - 1);
            } else {
                int score = Integer.parseInt(c);
                res += score;
                opr.add(score);
            }
        }

        return res;
    }
}
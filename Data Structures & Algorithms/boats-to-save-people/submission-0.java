class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int res = 0;

        int l = 0, r = people.length - 1;

        while(l <= r) {
            int remaining = limit - people[r--];

            if(l <= r && remaining >= people[l]) {
                l++;
            };

            res++;
        }
        return res;
    }
}
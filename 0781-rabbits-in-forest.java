class Solution {
    public int numRabbits(int[] answers) {
        if (answers == null || answers.length == 0) {
            throw new IllegalArgumentException("invalid");
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int answer : answers) {
            if (answer < 0) {
                throw new IllegalArgumentException("invalid");
            }
            if (!map.containsKey(answer)) {
                ans += answer + 1;
            }
            map.put(answer, map.getOrDefault(answer, answer + 1) - 1);
            if (map.get(answer) == 0) {
                map.remove(answer);
            }
        }
        return ans;
    }
}

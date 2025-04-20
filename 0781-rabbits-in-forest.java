class Solution {
    public int numRabbits(int[] answers) {
        if (answers == null || answers.length == 0) {
            throw new IllegalArgumentException("invalid");
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int answer : answers) {
            if (answer < 0) {
                throw new IllegalArgumentException("invalid");
            }
            map.put(answer, map.getOrDefault(answer, 0) + 1);
        }
        int ans = 0;
        for (int key : map.keySet()) {
            int size = (key + 1);
            ans += (map.get(key) + key) / size * size;
        }
        return ans;
    }
}

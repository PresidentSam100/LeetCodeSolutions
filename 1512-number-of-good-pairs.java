class Solution {
    public int numIdenticalPairs(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("invalid");
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        for (int v : map.values()) {
            ans += v * (v - 1) / 2;
        }
        return ans;
    }
}

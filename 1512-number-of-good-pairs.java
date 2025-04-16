class Solution {
    public int numIdenticalPairs(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("invalid");
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int num : nums) {
            int count = map.getOrDefault(num, 0);
            ans += count;
            map.put(num, count + 1);
        }
        return ans;
    }
}

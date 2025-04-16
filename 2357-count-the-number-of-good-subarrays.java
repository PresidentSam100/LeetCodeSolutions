class Solution {
    public long countGood(int[] nums, int k) {
        if (nums == null || k < 0) {
            throw new IllegalArgumentException("invalid");
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        long pair = 0;
        long ans = 0;
        for (int num : nums) {
            int prev = map.getOrDefault(num, 0);
            pair += prev;
            map.put(num, prev + 1);
            while (pair >= k) {
                int x = nums[left++];
                int y = map.get(x);
                map.put(x, y - 1);
                pair -= (y - 1);
            }
            ans += left;
        }
        return ans;
    }
}

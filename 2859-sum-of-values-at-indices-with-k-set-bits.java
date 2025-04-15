class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        if (nums == null || k < 0) {
            throw new IllegalArgumentException("invalid");
        }
        int ans = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (Integer.bitCount(i) == k) {
                ans += nums.get(i);
            }
        }
        /*
        // Gosper's Hack: Optimal for large nums.size() and small k
        int x = (1 << k) - 1;
        while (x < nums.size()) {
            ans += nums.get(x);
            int c = x & -x;
            int r = x + c;
            if (c == 0) {
                break;
            }
            x = (((r ^ x) >>> 2) / c) | r;
            if (x == 0) {
                break;
            }
        }
        */
        return ans;
    }
}

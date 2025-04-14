class Solution {
    public int minimumOperations(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("invalid");
        }
        int ans = 0;
        for (int num : nums) {
            if (num % 3 != 0) {
                ans++;
            }
        }
        return ans;
    }
}

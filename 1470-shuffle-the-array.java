class Solution {
    public int[] shuffle(int[] nums, int n) {
        if (nums == null || nums.length != n * 2) {
            throw new IllegalArgumentException("invalid");
        }
        int[] ans = new int[n * 2];
        for (int i = 0; i < n; i++) {
            ans[i * 2] = nums[i];
            ans[i * 2 + 1] = nums[i + n];
        }
        return ans;
    }
}

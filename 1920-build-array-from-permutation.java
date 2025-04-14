class Solution {
    public int[] buildArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("invalid");
        }
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

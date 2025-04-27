class Solution {
    public int countSubarrays(int[] nums) {
        if (nums == null || nums.length < 3) {
            throw new IllegalArgumentException("invalid");
        }
        int n = nums.length;
        int ans = 0;
        for (int i = 1; i < n - 1; i++) {
            if ((nums[i - 1] + nums[i + 1]) * 2 == nums[i]) {
                ans++;
            }
        }
        return ans;
    }
}

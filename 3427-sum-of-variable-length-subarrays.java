class Solution {
    public int subarraySum(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("invalid");
        }
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int j = i - nums[i] - 1;
            nums[i] += nums[i - 1];
            ans += nums[i] - (j < 0 ? 0 : nums[j]);
        }
        return ans;
    }
}

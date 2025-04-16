class Solution {
    public int[] runningSum(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("invalid");
        }
        int n = nums.length;
        int[] ans = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            ans[i] = sum;
        }
        return ans;
    }
}

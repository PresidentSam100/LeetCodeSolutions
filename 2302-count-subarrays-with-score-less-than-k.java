class Solution {
    public long countSubarrays(int[] nums, long k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            throw new IllegalArgumentException("invalid");
        }
        long sum = 0;
        long ans = 0;
        for (int i = 0, j = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum * (i - j + 1) >= k) {
                sum -= nums[j++];
            }
            ans += i - j + 1;
        }
        return ans;
    }
}

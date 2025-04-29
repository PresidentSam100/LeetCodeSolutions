class Solution {
    public long countSubarrays(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            throw new IllegalArgumentException("invalid");
        }
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        int n = nums.length;
        int i = 0;
        long cnt = 0;
        long ans = 0;
        for (int j = 0; j < n; j++) {
            if (nums[j] == max) {
                cnt++;
            }
            while (cnt >= k) {
                ans += (n - j);
                if (nums[i] == max) {
                    cnt--;
                }
                i++;
            }
        }
        return ans;
    }
}

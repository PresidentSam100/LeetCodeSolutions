class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        if (nums == null || nums.length == 0 || lower > upper) {
            throw new IllegalArgumentException("invalid");
        }
        Arrays.sort(nums);
        return count(nums, upper) - count(nums, lower - 1);
    }
  
    private long count(int[] nums, int limit) {
        long ans = 0;
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            if (nums[l] + nums[r] <= limit) {
                ans += (r - l);
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }
}

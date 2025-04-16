class Solution {
    public int[] runningSum(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("invalid");
        }
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}

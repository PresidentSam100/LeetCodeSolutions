class Solution {
    public int minOperations(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            throw new IllegalArgumentException("invalid");
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum % k;
    }
}

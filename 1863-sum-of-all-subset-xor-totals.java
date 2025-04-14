class Solution {
    public int subsetXORSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("invalid");
        }
        int total = 0;
        for (int num : nums) {
            total |= num;
        }
        return total << (nums.length - 1);
    }
}

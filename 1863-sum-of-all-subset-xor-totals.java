class Solution {
    public int subsetXORSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int total = 0;
        for (int num : nums) {
            total |= num;
        }
        return total << (nums.length - 1);
    }
}

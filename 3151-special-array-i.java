class Solution {
    public boolean isArraySpecial(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("invalid");
        }
        boolean parity = (nums[0] & 1) == 0;
        for (int i = 1; i < nums.length; i++) {
            boolean val = (nums[i] & 1) == 0;
            if (val == parity) {
                return false;
            }
            parity = val;
        }
        return true;
    }
}

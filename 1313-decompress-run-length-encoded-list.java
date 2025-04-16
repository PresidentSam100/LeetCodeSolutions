class Solution {
    public int[] decompressRLElist(int[] nums) {
        if (nums == null || nums.length % 2 != 0) {
            throw new IllegalArgumentException("invalid");
        }
        int len = 0;
        for (int i = 0; i < nums.length; i += 2) {
            len += nums[i];
        }
        int[] ans = new int[len];
        int pos = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(ans, pos, pos + nums[i], nums[i + 1]);
            pos += nums[i];
        }
        return ans;
    }
}

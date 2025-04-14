class Solution {
    public int[] transformArray(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("invalid");
        }
        int n = nums.length;
        int[] ans = new int[n];
        int l = 0;
        int r = n - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                ans[l++] = 0;
            } else {
                ans[r--] = 1;
            }
        }
        return ans;
    }
}

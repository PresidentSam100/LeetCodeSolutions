class Solution {
    public int findNumbers(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("invalid");
        }
        int ans = 0;
        for (int num : nums) {
            int d = 0;
            while (num > 0) {
                num /= 10;
                d++;
            }
            if (d % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
}

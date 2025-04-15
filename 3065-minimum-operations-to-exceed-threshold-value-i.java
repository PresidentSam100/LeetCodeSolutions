class Solution {
    public int minOperations(int[] nums, int k) {
        if (nums == null) {
            throw new IllegalArgumentException("invalid");
        }
        int ans = 0;
        for (int num : nums) {
            if (num < k) {
                ans++;
            }
        }
        return ans;
        // Parallel Processing for very large arrays and on multi-core CPUs.
        // return (int) Arrays.stream(nums).parallel().filter(num -> num < k).count();
    }
}

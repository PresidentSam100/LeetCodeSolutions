class Solution {
    public int repeatedNTimes(int[] nums) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("invalid");
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        throw new IllegalStateException("invalid");
    }
}

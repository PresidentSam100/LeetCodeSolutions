class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("invalid");
        }
        int[] ans = new int[2];
        int index = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                if (index >= 2) {
                    throw new IllegalStateException("invalid");
                }
                ans[index++] = num;
            }
        }
        if (index != 2) {
            throw new IllegalStateException("invalid");
        }
        return ans;
    }
}

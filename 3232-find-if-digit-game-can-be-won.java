class Solution {
    public boolean canAliceWin(int[] nums) {
        if (nums == null | nums.length == 0) {
            throw new IllegalArgumentException("invalid");
        }
        int singleSum = 0;
        int doubleSum = 0;
        for (int num : nums) {
            if (num < 1 || num > 99) {
                throw new IllegalArgumentException("invalid");
            }
            if (num < 10) {
                singleSum += num;
            } else {
                doubleSum += num;
            }
        }
        return singleSum != doubleSum;
    }
}

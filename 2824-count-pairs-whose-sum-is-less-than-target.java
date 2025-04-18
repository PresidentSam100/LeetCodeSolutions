class Solution {
    public int countPairs(List<Integer> nums, int target) {
        if (nums == null || nums.size() == 0) {
            throw new IllegalArgumentException("invalid");
        }
        int ans = 0;
        Collections.sort(nums);
        int l = 0;
        int r = nums.size() - 1;
        while (l < r) {
            if (nums.get(l) + nums.get(r) < target) {
                ans += r - l++;
            } else {
                r--;
            }
        }
        return ans;
    }
}

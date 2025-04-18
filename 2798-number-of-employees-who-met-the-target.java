class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        if (hours == null || hours.length == 0 || target < 0) {
            throw new IllegalArgumentException("invalid");
        }
        int ans = 0;
        for (int hour : hours) {
            if (hour < 0) {
                throw new IllegalArgumentException("invalid");
            }
            if (hour >= target) {
                ans++;
            }
        }
        return ans;
    }
}

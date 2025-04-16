class Solution {
    public int numberOfSteps(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("invalid");
        }
        int ans = 0;
        while (num != 0) {
            num = (num & 1) == 0 ? num >> 1 : num - 1;
            ans++;
        }
        return ans;
    }
}

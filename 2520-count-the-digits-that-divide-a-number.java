class Solution {
    public int countDigits(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("invalid");
        }
        int ans = 0;
        int n = num;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0) {
                throw new IllegalArgumentException("invalid");
            }
            if (num % digit == 0) {
                ans++;
            }
            n /= 10;
        }
        return ans;
    }
}

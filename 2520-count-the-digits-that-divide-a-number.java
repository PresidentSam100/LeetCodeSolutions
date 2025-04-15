class Solution {
    public int countDigits(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("invalid");
        }
        int ans = 0;
        int n = num;
        while (n > 0) {
            if (n % 10 == 0) {
                throw new IllegalArgumentException("invalid");
            }
            if (num % (n % 10) == 0) {
                ans++;
            }
            n /= 10;
        }
        return ans;
    }
}

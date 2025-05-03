class Solution {
    public int reverse(int x) {
        int neg = (x < 0) ? -1 : 1;
        long ans = 0;
        x = Math.abs(x);
        while (x > 0) {
            ans *= 10;
            ans += x % 10;
            x /= 10;
        }
        if (Integer.MIN_VALUE < ans && ans < Integer.MAX_VALUE) {
            return (int)ans * neg;
        }
        return 0;
    }
}

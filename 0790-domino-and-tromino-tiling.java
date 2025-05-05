class Solution {
    public int numTilings(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("invalid");
        }
        long[] arr = new long[n + 3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 5;
        for (int i = 3; i < n; i++) {
            arr[i] = 2 * arr[i - 1] + arr[i - 3];
            arr[i] %= 1000000007;
        }
        return (int)arr[n - 1];
    }
}

class Solution {
    public int findJudge(int n, int[][] trust) {
        if (trust == null || n < 1) {
            throw new IllegalArgumentException("invalid");
        }
        int[] count = new int[n];
        for (int[] t : trust) {
            if (t == null || t.length != 2) {
                throw new IllegalArgumentException("invalid");
            }
            count[t[0] - 1]--;
            count[t[1] - 1]++;
        }
        for (int i = 0; i < n; i++) {
            if (count[i] == n - 1) {
                return i + 1;
            }
        }
        return -1;
    }
}

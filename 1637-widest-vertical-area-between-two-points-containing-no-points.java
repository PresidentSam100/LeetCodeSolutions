class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        if (points == null || points.length <= 1) {
            throw new IllegalArgumentException("invalid");
        }
        int n = points.length;
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = points[i][0];
        }
        Arrays.sort(x);
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (x[i] - x[i - 1] > ans) {
                ans = x[i] - x[i - 1];
            }
        }
        return ans;
    }
}

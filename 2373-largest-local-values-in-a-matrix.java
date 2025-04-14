class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int m = n - 2;
        int[][] maxLocal = new int[m][m];
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < m; c++) {
                int temp = Integer.MIN_VALUE;
                for (int i = r; i < r + 3; i++) {
                    for (int j = c; j < c + 3; j++) {
                        temp = Math.max(temp, grid[i][j]);
                    }
                }
                maxLocal[r][c] = temp;
            }
        }
        return maxLocal;
    }
}

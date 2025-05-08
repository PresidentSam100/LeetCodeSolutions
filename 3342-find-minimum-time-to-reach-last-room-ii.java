class Solution {
    public int minTimeToReach(int[][] moveTime) {
        if (moveTime == null || moveTime.length < 2 || moveTime[0].length < 2) {
            throw new IllegalArgumentException("invalid");
        }
        int n = moveTime.length;
        int m = moveTime[0].length;
        int[][][] dp = new int[n][m][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Arrays.fill(dp[i][j], Integer.MAX_VALUE);
            }
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.add(new int[]{0, 0, 0, 0});
        dp[0][0][0] = 0;
        int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int time = curr[0];
            int row = curr[1];
            int col = curr[2];
            int p = curr[3];
            if (time > dp[row][col][p]) {
                continue;
            }
            if (row == n - 1 && col == m - 1) {
                return time;
            }
            for (int[] dir : dirs) {
                int nRow = row + dir[0];
                int nCol = col + dir[1];
                if (nRow >= 0 && nRow < n && nCol >= 0 && nCol < m) {
                    int start = Math.max(time, moveTime[nRow][nCol]);
                    int move = (p == 0) ? 1 : 2;
                    int nTime = start + move;
                    int nP = (p + 1) % 2;
                    if (nTime < dp[nRow][nCol][nP]) {
                        dp[nRow][nCol][nP] = nTime;
                        pq.add(new int[]{nTime, nRow, nCol, nP});
                    }
                }
            }
        }
        return -1;
    }
}

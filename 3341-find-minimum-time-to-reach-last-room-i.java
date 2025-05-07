class Solution {
    public int minTimeToReach(int[][] moveTime) {
        if (moveTime == null || moveTime.length < 2 || moveTime[0].length < 2) {
            throw new IllegalArgumentException("invalid");
        }
        int n = moveTime.length;
        int m = moveTime[0].length;
        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.add(new int[]{0, 0, 0});
        moveTime[0][0] = 0;
        int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int time = curr[0];
            int row = curr[1];
            int col = curr[2];
            if (time >= dp[row][col]) {
                continue;
            }
            if (row == n - 1 && col == m - 1) {
                return time;
            }
            dp[row][col] = time;
            for (int[] dir : dirs) {
                int nRow = row + dir[0];
                int nCol = col + dir[1];
                if (nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && dp[nRow][nCol] == Integer.MAX_VALUE) {
                    int nTime = Math.max(moveTime[nRow][nCol], time) + 1;
                    pq.add(new int[]{nTime, nRow, nCol});
                }
            }
        }
        return -1;
    }
}

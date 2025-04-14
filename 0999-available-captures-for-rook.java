class Solution {
    public int numRookCaptures(char[][] board) {
        int R = -1, C = -1;
        loop:
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] == 'R') {
                    R = r;
                    C = c;
                    break loop;
                }
            }
        }
        int ans = 0;
        int[] x = {0, 1, 0, -1};
        int[] y = {1, 0, -1, 0};
        for (int i = 0; i < 4; i++) {
            int rr = R;
            int cc = C;
            while (0 <= rr && rr < board.length && 0 <= cc && cc < board[rr].length) {
                if (board[rr][cc] == 'p') {
                    ans++;
                    break;
                } else if (board[rr][cc] == 'B') {
                    break;
                }
                rr += y[i];
                cc += x[i];
            }
        }
        return ans;
    }
}

class Solution {
    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        Arrays.sort(tasks);
        Arrays.sort(workers);
        int l = 0;
        int r = Math.min(tasks.length, workers.length);
        int ans = 0;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (good(m, tasks, workers, pills, strength)) {
                ans = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }
    private boolean good(int n, int[] tasks, int[] workers, int pills, int strength) {
        int t = 0;
        Deque<Integer> q = new ArrayDeque<>();
        int p = pills;
        int w = workers.length;
        for (int i = w - n; i < w; i++) {
            while (t < n && tasks[t] <= workers[i] + strength) {
                q.addLast(tasks[t]);
                t++;
            }
            if (q.isEmpty()) {
                return false;
            }
            if (workers[i] >= q.peekFirst()) {
                q.pollFirst();
            } else if (p-- > 0) {
                q.pollLast();
            } else {
                return false;
            }
        }
        return true;
    }
}

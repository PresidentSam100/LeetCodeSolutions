class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        if (tops == null || tops.length == 0 || bottoms == null || bottoms.length == 0 || tops.length != bottoms.length) {
            throw new IllegalArgumentException("invalid");
        }
        int[] nums = new int[]{tops[0], bottoms[0]};
        int n = Math.max(tops.length, bottoms.length);
        int ans = n;
        for (int num : nums) {
            int tt = 0;
            int bb = 0;
            for (int i = 0; i < n; i++) {
                int t = tops[i];
                int b = bottoms[i];
                if (t == num && b != num) {
                    tt++;
                } else if (t != num && b == num) {
                    bb++;
                } else if (t == num && b == num) {
                    continue;
                } else {
                    tt = bb = n;
                    break;
                }
            }
            ans = Math.min(ans, Math.min(tt, bb));
            
        }
        return (ans == n) ? -1 : ans;
    }
}

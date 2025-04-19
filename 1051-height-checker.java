class Solution {
    public int heightChecker(int[] heights) {
        if (heights == null || heights.length == 0) {
            throw new IllegalArgumentException("invalid");
        }
        int[] counts = new int[100];
        for (int height : heights) {
            if (height < 1 || height > 100) {
                throw new IllegalArgumentException("invalid");
            }
            counts[height - 1]++;
        }
        int ans = 0;
        int currHeight = 0;
        for (int height : heights) {
            while (counts[currHeight] == 0) {
                currHeight++;
            }
            if (currHeight != height - 1) {
                ans++;
            }
            counts[currHeight]--;
        }
        return ans;
    }
}

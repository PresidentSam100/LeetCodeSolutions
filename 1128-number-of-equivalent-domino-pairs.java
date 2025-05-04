class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] arr = new int[100];
        int ans = 0;
        for (int[] domino : dominoes) {
            int a = domino[0];
            int b = domino[1];
            int k = (a < b ? a * 10 + b : b * 10 + a);
            ans += arr[k];
            arr[k]++;
        }
        return ans;
    }
}

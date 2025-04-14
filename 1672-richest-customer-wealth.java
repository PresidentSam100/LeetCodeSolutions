class Solution {
    public int maximumWealth(int[][] accounts) {
        if (accounts == null || accounts.length == 0) {
            throw new IllegalArgumentException("invalid");
        }
        int ans = Integer.MIN_VALUE;
        for (int[] customer : accounts) {
            if (customer == null || customer.length == 0) {
                throw new IllegalArgumentException("invalid");
            }
            int temp = 0;
            for (int money : customer) {
                temp += money;
            }
            if (temp > ans) {
                ans = temp;
            }
        }
        return ans;
    }
}

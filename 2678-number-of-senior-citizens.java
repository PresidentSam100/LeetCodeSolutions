class Solution {
    public int countSeniors(String[] details) {
        if (details == null || details.length == 0) {
            throw new IllegalArgumentException("invalid");
        }
        int ans = 0;
        for (String detail : details) {
            if (detail == null || detail.length() != 15) {
                throw new IllegalArgumentException("invalid");
            }
            int ten = (detail.charAt(11) - '0');
            int one = (detail.charAt(12) - '0');
            if (ten < 0 || ten > 9 || one < 0 || one > 9) {
                throw new IllegalArgumentException("invalid");
            }
            int age = ten * 10 + one;
            if (age > 60) {
                ans++;
            }
        }
        return ans;
    }
}

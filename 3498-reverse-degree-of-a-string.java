class Solution {
    public int reverseDegree(String s) {
        if (s == null) {
            throw new IllegalArgumentException("invalid");
        }
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < 'a' || c > 'z') {
                throw new IllegalArgumentException("invalid");
            }
            ans += ('z' - c + 1) * (i + 1);
        }
        return ans;
    }
}

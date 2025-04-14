class Solution {
    public int scoreOfString(String s) {
        if (s == null || s.length() < 2) {
            return 0;
        }
        int score = 0;
        for (int i = 1; i < s.length(); i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }
        return score;
    }
}

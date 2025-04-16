class Solution {
    public String truncateSentence(String s, int k) {
        if (s == null || k <= 0) {
            throw new IllegalArgumentException("invalid");
        }
        int words = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                words++;
                if (words == k) {
                    return s.substring(0, i);
                }
            }
        }
        return s;
    }
}

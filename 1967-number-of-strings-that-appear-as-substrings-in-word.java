class Solution {
    public int numOfStrings(String[] patterns, String word) {
        if (patterns == null || patterns.length == 0 || word == null) {
            throw new IllegalArgumentException("invalid");
        }
        int ans = 0;
        for (String pattern : patterns) {
            if (pattern == null) {
                throw new IllegalArgumentException("invalid");
            }
            if (word.indexOf(pattern) != -1) {
                ans++;
            }
        }
        return ans;
    }
}

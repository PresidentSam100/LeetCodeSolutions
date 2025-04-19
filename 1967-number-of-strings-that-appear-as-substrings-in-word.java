class Solution {
    public int numOfStrings(String[] patterns, String word) {
        if (patterns == null || patterns.length == 0 || word == null || word.isEmpty()) {
            throw new IllegalArgumentException("invalid");
        }
        int ans = 0;
        for (String pattern : patterns) {
            if (pattern == null || pattern.isEmpty()) {
                throw new IllegalArgumentException("invalid");
            }
            if (word.contains(pattern)) {
                ans++;
            }
        }
        return ans;
    }
}

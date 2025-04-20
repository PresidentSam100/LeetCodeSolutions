class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        if (words == null || words.length == 0) {
            throw new IllegalArgumentException("invalid");
        }
        HashSet<String> set = new HashSet<>();
        int ans = 0;
        for (String word : words) {
            if (word == null || word.length() != 2) {
                throw new IllegalArgumentException("invalid");
            }
            if (set.remove(word)) {
                ans++;
            } else {
                set.add(new StringBuilder(word).reverse().toString());
            }
        }
        return ans;
    }
}

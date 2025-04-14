class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        if (allowed == null || words == null) {
            throw new IllegalArgumentException("invalid");
        }
        HashSet<Character> set = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }
        int ans = words.length;
        for (String word : words) {
            if (word == null || word.length() == 0) {
                throw new IllegalArgumentException("invalid");
            }
            for (char c : word.toCharArray()) {
                if (!set.contains(c)) {
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
}

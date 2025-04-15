class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if (word1 == null || word2 == null) {
            throw new IllegalArgumentException("invalid");
        }
        int len1 = 0;
        int len2 = 0;
        for (String word : word1) {
            if (word == null) {
                throw new IllegalArgumentException("invalid");
            }
            len1 += word.length();
        }
        for (String word : word2) {
            if (word == null) {
                throw new IllegalArgumentException("invalid");
            }
            len2 += word.length();
        }
        if (len1 != len2) {
            return false;
        }
        return String.join("", word1).equals(String.join("", word2));
    }
}

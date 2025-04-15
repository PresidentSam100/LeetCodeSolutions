class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if (word1 == null || word2 == null) {
            throw new IllegalArgumentException("invalid");
        }
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for (String word : word1) {
            if (word == null) {
                throw new IllegalArgumentException("invalid");
            }
            str1.append(word);
        }
        for (String word : word2) {
            if (word == null) {
                throw new IllegalArgumentException("invalid");
            }
            str2.append(word);
        }
        return str1.toString().equals(str2.toString());
    }
}

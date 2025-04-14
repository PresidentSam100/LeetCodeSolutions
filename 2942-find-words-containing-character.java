class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        if (words == null) {
            throw new IllegalArgumentException("invalid");
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                ans.add(i);
            }
        }
        return ans;
    }
}

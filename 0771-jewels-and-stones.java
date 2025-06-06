class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        if (jewels == null || stones == null) {
            throw new IllegalArgumentException("invalid");
        }
        HashSet<Character> set = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            set.add(c);
        }
        int ans = 0;
        for (char c : stones.toCharArray()) {
            if (set.contains(c)) {
                ans++;
            }
        }
        return ans;
    }
}

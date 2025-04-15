class Solution {
    public int numberOfMatches(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("invalid");
        }
        return n - 1;
    }
}

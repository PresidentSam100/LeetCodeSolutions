class Solution {
    public int smallestEvenMultiple(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("invalid");
        }
        return (n & 1) == 0 ? n : n << 1;
    }
}

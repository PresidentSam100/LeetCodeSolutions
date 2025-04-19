class Solution {
    public boolean isSameAfterReversals(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("invalid");
        }
        return num == 0 || num % 10 != 0;
    }
}

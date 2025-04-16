class Solution {
    public int theMaximumAchievableX(int num, int t) {
        if (t <= 0) {
            throw new IllegalArgumentException("invalid");
        }
        return num + t * 2;
    }
}

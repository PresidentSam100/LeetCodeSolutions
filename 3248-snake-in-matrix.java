class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        if (commands == null || n <= 1) {
            throw new IllegalArgumentException("invalid");
        }
        int ans = 0;
        for (String command : commands) {
            if (command == null) {
                throw new IllegalArgumentException("invalid");
            }
            ans += switch (command) {
                case "RIGHT" -> 1;
                case "LEFT" -> -1;
                case "UP" -> -n;
                case "DOWN" -> n;
                default -> throw new IllegalArgumentException("invalid");
            };
            if (ans < 0 || ans >= n * n) {
                throw new IllegalArgumentException("invalid");
            }
        }
        return ans;
    }
}

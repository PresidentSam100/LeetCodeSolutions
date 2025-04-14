class Solution {
    public int finalValueAfterOperations(String[] operations) {
        if (operations == null || operations.length == 0) {
            throw new IllegalArgumentException("invalid");
        }
        int x = 0;
        for (String operation : operations) {
            switch (operation) {
                case "--X":
                case "X--":
                    x -= 1;
                    break;
                case "++X":
                case "X++":
                    x += 1;
                    break;
                default:
                    throw new IllegalArgumentException("invalid");
            }
        }
        return x;
    }
}

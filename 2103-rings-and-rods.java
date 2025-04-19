class Solution {
    public int countPoints(String rings) {
        if (rings == null || rings.length() % 2 != 0) {
            throw new IllegalArgumentException("invalid");
        }
        int[] rods = new int[10];
        int ans = 0;
        for (int i = 0; i < rings.length(); i += 2) {
            int colorBit = switch (rings.charAt(i)) {
                case 'R' -> 0b001;
                case 'G' -> 0b010;
                case 'B' -> 0b100;
                default -> throw new IllegalArgumentException("invalid");
            };
            int rodIndex = rings.charAt(i + 1) - '0';
            if (rodIndex < 0 || rodIndex > 9) {
                throw new IllegalArgumentException("invalid");
            }
            if (rods[rodIndex] != 0b111) {
                rods[rodIndex] |= colorBit;
                if (rods[rodIndex] == 0b111) {
                    ans++;
                }
            }
        }
        return ans;
    }
}

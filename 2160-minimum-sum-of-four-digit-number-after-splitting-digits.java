class Solution {
    public int minimumSum(int num) {
        if (num < 1000 || num > 9999) {
            throw new IllegalArgumentException("invalid");
        }
        int[] digits = new int[4];
        int index = 0;
        while (num > 0) {
            digits[index++] = num % 10;
            num /= 10;
        }
        Arrays.sort(digits);
        return 10 * (digits[0] + digits[1]) + digits[2] + digits[3];
    }
}

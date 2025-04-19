class Solution {
    public String replaceDigits(String s) {
        if (s == null) {
            throw new IllegalArgumentException("invalid");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            char c = s.charAt(i);
            if (c < 'a' || c > 'z') {
                throw new IllegalArgumentException("invalid");
            }
            sb.append(c);
            if (i < s.length() - 1) {
                int shift = s.charAt(i + 1) - '0';
                if (shift < 0 || shift > 9) {
                    throw new IllegalArgumentException("invalid");
                }
                sb.append((char)(c + shift));
            }
        }
        return sb.toString();
    }
}

class Solution {
    public String finalString(String s) {
        if (s == null || s.length() == 0) {
            throw new IllegalArgumentException("invalid");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < 'a' || c > 'z') {
                throw new IllegalArgumentException("invalid");
            }
            if (c == 'i') {
                sb.reverse();
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

class Solution {
    public String countAndSay(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("invalid");
        }
        String ans = "1";
        for (int i = 1; i < n; i++) {
            int len = ans.length();
            StringBuilder next = new StringBuilder(len * 2);
            char[] chars = ans.toCharArray();
            int j = 0;
            while (j < len) {
                char curr = chars[j];
                int count = 1;
                while (j + count < len && chars[j + count] == curr) {
                    count++;
                }
                next.append(count).append(curr);
                j += count;
            }
            ans = next.toString();
        }
        return ans;
    }
}

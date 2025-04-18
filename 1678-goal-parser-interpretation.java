class Solution {
    public String interpret(String command) {
        if (command == null) {
            throw new IllegalArgumentException("invalid");
        }
        int n = command.length();
        StringBuilder ans = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            if (command.charAt(i) == 'G') {
                ans.append('G');
            } else if (command.charAt(i) == '(') {
                if (i < n - 1 && command.charAt(i + 1) == ')') {
                    ans.append('o');
                    i++;
                } else if (i < n - 3 && command.substring(i + 1, i + 4).equals("al)")) {
                    ans.append("al");
                    i += 3;
                }
            }
        }
        return ans.toString();
    }
}

class Solution {
    public String pushDominoes(String dominoes) {
        dominoes = 'L' + dominoes + 'R';
        StringBuilder ans = new StringBuilder();
        for (int i = 0, j = 1; j < dominoes.length(); ++j) {
            if (dominoes.charAt(j) == '.') {
                continue;
            }
            int m = j - i - 1;
            if (i > 0) {
                ans.append(dominoes.charAt(i));
            }
            if (dominoes.charAt(i) == dominoes.charAt(j)) {
                for (int k = 0; k < m; k++) {
                    ans.append(dominoes.charAt(i));
                }
            } else if (dominoes.charAt(i) == 'L' && dominoes.charAt(j) == 'R') {
                for (int k = 0; k < m; k++) {
                    ans.append('.');
                }
            } else {
                for (int k = 0; k < m / 2; k++) {
                    ans.append('R');
                }
                if (m % 2 == 1) {
                    ans.append('.');
                }
                for (int k = 0; k < m / 2; k++) {
                    ans.append('L');
                }
            }
            i = j;
        }
        return ans.toString();
    }
}

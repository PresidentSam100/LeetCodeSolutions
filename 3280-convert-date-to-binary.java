class Solution {
    public String convertDateToBinary(String date) {
        if (date == null || date.length() != 10 || date.charAt(4) != '-' || date.charAt(7) != '-') {
            throw new IllegalArgumentException("invalid");
        }
        int year = 0;
        for (int i = 0; i < 4; i++) {
            char c = date.charAt(i);
            if (c < '0' || c > '9') {
                throw new IllegalArgumentException("invalid");
            }
            year = year * 10 + (c - '0');
        }
        int month = 0;
        for (int i = 5; i < 7; i++) {
            char c = date.charAt(i);
            if (c < '0' || c > '9') {
                throw new IllegalArgumentException("invalid");
            }
            month = month * 10 + (c - '0');
        }
        int day = 0;
        for (int i = 8; i < 10; i++) {
            char c = date.charAt(i);
            if (c < '0' || c > '9') {
                throw new IllegalArgumentException("invalid");
            }
            day = day * 10 + (c - '0');
        }
        String yearB = Integer.toBinaryString(year);
        String monthB = Integer.toBinaryString(month);
        String dayB = Integer.toBinaryString(day);
        StringBuilder ans = new StringBuilder(yearB.length() + monthB.length() + dayB.length() + 2);
        ans.append(yearB).append('-').append(monthB).append('-').append(dayB);
        return ans.toString();
    }
}

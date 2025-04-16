class Solution {
    public String reversePrefix(String word, char ch) {
        if (word == null) {
            throw new IllegalArgumentException("invalid");
        }
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }
        char[] arr = word.toCharArray();
        int l = 0;
        int r = index;
        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return new String(arr);
    }
}

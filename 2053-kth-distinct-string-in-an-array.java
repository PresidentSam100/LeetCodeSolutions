class Solution {
    public String kthDistinct(String[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            throw new IllegalArgumentException("invalid");
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            if (s == null || s.length() == 0) {
                throw new IllegalArgumentException("invalid");
            }
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : arr) {
            if (map.get(s) == 1 && --k == 0) {
                return s;
            }
        }
        return "";
    }
}

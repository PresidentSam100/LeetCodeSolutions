class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0 || nums1.length != nums2.length) {
            throw new IllegalArgumentException("invalid");
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int num : nums1) {
            if (num > max1) {
                max1 = num;
            }
        }
        for (int num : nums2) {
            if (num > max2) {
                max2 = num;
            }
        }
        return max2 - max1;
    }
}

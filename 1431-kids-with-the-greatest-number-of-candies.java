class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        if (candies == null || candies.length == 0) {
            throw new IllegalArgumentException("invalid");
        }
        int maxExtra = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            maxExtra = Math.max(maxExtra, candies[i]);
        }
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= maxExtra);
        }
        return result;
    }
}

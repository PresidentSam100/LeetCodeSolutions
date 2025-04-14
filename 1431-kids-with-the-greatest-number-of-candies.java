class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        if (candies == null || candies.length == 0 || extraCandies < 0) {
            throw new IllegalArgumentException("invalid");
        }
        int maxExtra = Integer.MIN_VALUE;
        for (int candy : candies) {
            if (candy < 0) {
                throw new IllegalArgumentException("invalid");
            }
            maxExtra = Math.max(maxExtra, candy);
        }
        List<Boolean> result = new ArrayList<>(candies.length);
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxExtra);
        }
        return result;
    }
}

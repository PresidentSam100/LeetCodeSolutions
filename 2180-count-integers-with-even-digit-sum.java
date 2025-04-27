class Solution {
    public int countEven(int num) {
        int x = num;
        int s = 0;
        while (num > 0){
            s += num % 10;
            num /= 10;
        }
        return (s % 2 == 0 ? x / 2 : (x - 1) / 2);
    }
}

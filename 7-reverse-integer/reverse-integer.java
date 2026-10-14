class Solution {
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            try {
                res = Math.multiplyExact(res, 10);
                res = Math.addExact(res, digit);
            } catch (ArithmeticException e) {
                return 0;
            }
        }
        return res;
    }
}
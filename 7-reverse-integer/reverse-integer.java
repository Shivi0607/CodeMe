class Solution {
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            int newRes = res * 10 + digit;
            if ((newRes - digit) / 10 != res) {
                return 0;
            }
            res = newRes;
        }
        return res;
    }
}
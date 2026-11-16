class Solution {
    public boolean isHappy(int n) {
        int s = n;
        int f = getNext(n);
        while (f != 1 && s != f) {
            s = getNext(s);
            f = getNext(getNext(f));
        }
        return f == 1;
    }
    private int getNext(int num) {
        int totalSum = 0;
        while (num > 0) {
            int digit = num % 10;
            totalSum += digit * digit;
            num /= 10;
        }
        return totalSum;
    }
}
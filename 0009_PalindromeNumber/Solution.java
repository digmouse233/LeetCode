class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reverseX = reverse(x);

        if (reverseX == x) {
            return true;
        }

        return false;
    }

    private int reverse(int number) {
        int res = 0;

        while (number != 0) {
            int pop = number % 10;
            res = res * 10 + pop;
            number /= 10;
        }

        return res;
    }
}
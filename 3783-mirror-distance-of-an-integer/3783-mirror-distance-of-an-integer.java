class Solution {
    public int mirrorDistance(int n) {
        int rev = 0;
    int k = n;
    while (k != 0) {
        int dig = k % 10;
        rev = rev * 10 + dig;
        k = k / 10;
    }
    return Math.abs(n - rev);
    }
}
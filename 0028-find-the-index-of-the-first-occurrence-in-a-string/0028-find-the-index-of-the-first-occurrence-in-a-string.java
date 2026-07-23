class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.isEmpty()) {
            return 0;
        }
        int hLength = haystack.length();
        int nLength = needle.length();
        if (hLength < nLength) {
            return -1;
        }
        for (int i = 0; i <= hLength - nLength; i++) {
            if (haystack.substring(i, i + nLength).equals(needle)) {
                return i;
            }
        }       
        return -1;
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        String cleanword = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String rev = "";
        for(int i = cleanword.length()-1;i>=0;i--){
            rev = rev + cleanword.charAt(i);
        }
        return cleanword.equals(rev);
    }
}
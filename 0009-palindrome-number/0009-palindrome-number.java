class Solution {
    public boolean isPalindrome(int x) {
        int ori = x;
        int rev = 0;
        while(x>0){
            int rem = x % 10;
            rev = (rev * 10) + rem;
            x /= 10;
        }
        if(ori == rev){
            return Boolean.parseBoolean("true");
        }else{
            return Boolean.parseBoolean("false");
        }
    }
}
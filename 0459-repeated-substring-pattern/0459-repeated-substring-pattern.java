class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String add = s + s;
        String ex = add.substring(1,add.length()-1);
        return ex.contains(s); 
    }
}
class Solution {
    public int lengthOfLastWord(String s) {
        String[] word = s.trim().split("\\s+");
        int lastword = word[word.length-1].length();
        return lastword;
    }
}
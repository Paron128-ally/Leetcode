class Solution {
    public int lengthOfLastWord(String s) {
      String[] word = s.split(" ");
      String last = word[word.length-1];
      int count = last.length();
      return count;
    }
}
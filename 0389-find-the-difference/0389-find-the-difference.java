class Solution {
    public char findTheDifference(String s, String t) {
     char[] s1 = s.toCharArray();
     char[] t1 = t.toCharArray();
     char result = 0;
     for(char num : s1) {
            result ^= num;
        }
        for(char num : t1) {
            result ^= num;
        }
        return result;
    }
}
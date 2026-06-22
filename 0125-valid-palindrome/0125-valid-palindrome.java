class Solution {
    public boolean isPalindrome(String s) {
     boolean flag = true;
     String clean = s.replaceAll("[^a-zA-Z0-9]", "");
     int n = clean.length();
     String og = clean.toLowerCase();
     char[] c = og.toCharArray();
     int i;
     for(i=0;i<n/2;i++){
      if(c[i] != c[n-i-1]){
        flag = false;
        break;
      }
     } 
     return flag;  
    }
}
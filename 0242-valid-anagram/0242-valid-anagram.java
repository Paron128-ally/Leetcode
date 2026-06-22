class Solution {
    public boolean isAnagram(String s, String t) {
       int s1 = s.length();
       int t1 = t.length();
       if(s1!=t1){
        return false;
       } 
       String str = s.toLowerCase();
       String ttr = t.toLowerCase();
       char[] a = str.toCharArray();
       char[] b = ttr.toCharArray();

       Arrays.sort(a);
       Arrays.sort(b);
       for(int i = 0; i<s1;i++){
        if(a[i] != b[i]){
            return false;
        }
       } 
       return true;
    }
}
class Solution {
    public boolean isPalindrome(int x) {
      if(x<0){
        return false;
      }
      int i=0;
      boolean flag = true;
      int[] array = new int[10];
      while(x>0){
       array[i] = x%10;
       x /= 10;
       i++;
      }
      for(int j =0;j<i/2;j++){
        if(array[j] != array[i-j-1]){
         flag = false;
         break;
        }
      }
      return flag;
    }
}
class Solution {
    public int[] findErrorNums(int[] nums) {
     int n = nums.length;
     int i,j;
     int rep=-1;
     for(i=0;i<n-1;i++){
       for(j=i+1;j<n;j++){
      if(nums[i] == nums[j]){
        rep = nums[i];
      }
     }
     }   
     int s=0;
     int miss;
     int ex = (n * (n + 1))/2;
     for(i = 0; i<n;i++){
      s += nums[i];
     }   
     miss = ex - (s- rep);
     return  new int[]{rep, miss};
    }
}
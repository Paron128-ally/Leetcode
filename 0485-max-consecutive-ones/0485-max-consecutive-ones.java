class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     int n =  nums.length;
     int i,count=0,max=0;
     for(i=0;i<n;i++){
        if(nums[i]==1){
          count++;
          if(count>max){
            max=count;
          }
        }
        else{
            count=0;
        }
     }   
     return max;
    }
}
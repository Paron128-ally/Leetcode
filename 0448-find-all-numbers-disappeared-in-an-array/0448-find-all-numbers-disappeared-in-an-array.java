class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      List<Integer> missingNumbers = new ArrayList<>();
        
        // Step 1: Mark existing elements as negative
        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]);
            int index = val - 1;
            
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        
        // Step 2: Identify indexes that are still positive
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                missingNumbers.add(i + 1);
            }
        }
        
        return missingNumbers;   
    }
}
class Solution {
  public void moveZeroes(int[] nums) {
    int n = nums.length;
    int left = 0, right = 0;
    for (right = 0; right < nums.length; right++) {
      if (nums[right] != 0) {
        int temp = nums[right];
        nums[right] = nums[left];
        nums[left] = temp;
        // just swap when the right is pointing to a non zero number
        left++;
      }
    }
  }
}
class Solution {
  public int minOperations(int[] nums, int k) {
    int final_XOR = 0;
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      final_XOR = final_XOR ^ nums[i];
    }
    count = 0;
    while (k > 0 || (final_XOR > 0)) {
      if (k % 2 != final_XOR % 2) {
        count++;
      }
      k /= 2;
      final_XOR /= 2;
    }
    return count;
  }
}
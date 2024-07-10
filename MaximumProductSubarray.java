//Approach-1(Brute Force)
class Solution {
  public int maxProduct(int[] nums) {
    long max = -10;
    int n = nums.length;
    int product;
    for (int i = 0; i < n; i++) {
      product = 1;
      for (int j = i; j < n; j++) {
        product = product * nums[j];
        max = Math.max(product, max);
      }
    }
    return (int) max;
  }
}
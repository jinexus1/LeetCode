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
//Approach-2(Observation)
class Solution {
  public int maxProduct(int[] nums) {
    double prefix = 1, suffix = 1;
    int max = Integer.MIN_VALUE;
    int n = nums.length;
    for (int i = 0; i < n; i++) {
      if (prefix == 0)
        prefix = 1;
      if (suffix == 0)
        suffix = 1;
      prefix = prefix * (double) nums[i];
      suffix = suffix * (double) nums[n - i - 1];
      max = (int) Math.max(Math.max(prefix, suffix), max);
    }
    return (int) max;
  }
}

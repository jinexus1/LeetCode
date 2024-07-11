class Solution {
  public int[] findErrorNums(int[] nums) {
    int[] result = new int[2];
    int[] count = new int[nums.length + 1];

    // Count the frequency of each number
    for (int num : nums) {
      count[num]++;
    }

    // Identify the repeating and missing numbers
    for (int i = 1; i < count.length; i++) {
      if (count[i] == 2) {
        result[0] = i; // Repeating number
      } else if (count[i] == 0) {
        result[1] = i; // Missing number
      }
    }

    return result;
  }
}

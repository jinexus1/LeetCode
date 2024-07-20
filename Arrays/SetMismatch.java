//Approach-1
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
//Approach-2
class Solution {
  public int[] findErrorNums(int[] nums) {
    int n = nums.length;
    long sum_n = n * (n + 1) / 2; // Sum of first n natural numbers
    long square_sum_n = n * (n + 1) * (2 * n + 1) / 6; // Sum of squares of first n natural numbers

    long sum_nums = 0;
    long square_sum_nums = 0;

    for (int num : nums) {
      sum_nums += num;
      square_sum_nums += (long) num * (long) num;
    }

    long diff_sum = sum_nums - sum_n; // x - y
    long diff_square_sum = square_sum_nums - square_sum_n; // x^2 - y^2

    // From the equations:
    // x - y = diff_sum
    // x^2 - y^2 = diff_square_sum = (x - y) * (x + y)
    // We can derive:
    long sum_xy = diff_square_sum / diff_sum; // x + y

    int x = (int) ((diff_sum + sum_xy) / 2); // duplicate number
    int y = (int) (sum_xy - x); // missing number

    return new int[] { x, y };
  }
}

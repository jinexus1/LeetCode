//Approach-1(Brute Force)
class Solution {
  public int[] findMissingAndRepeatedValues(int[][] grid) {
    int n = grid.length;
    int m = n * n;
    int[] numbers = new int[m];
    int[] ans = new int[2];
    int k = 0;

    // Converting the 2D into 1D
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        numbers[k++] = grid[i][j];
      }
    }

    // Sort the array
    Arrays.sort(numbers);

    // Check for missing and repeating numbers
    if (numbers[0] != 1) {
      ans[1] = 1;
    }
    if (numbers[m - 1] != m) {
      ans[1] = m;
    }
    for (int i = 1; i < m; i++) {
      if (numbers[i] == numbers[i - 1]) {// if the current element
        // is equal to next element
        ans[0] = numbers[i]; // Repeating number
      }
      if ((numbers[i] - numbers[i - 1]) == 2) {// if the difference of
        // two consequtive numbers is 2 that means a number is missing
        ans[1] = (numbers[i] + numbers[i - 1]) / 2; // Missing number
      }
    }

    return ans;
  }
}
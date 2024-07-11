class Solution {
  public int findMaxConsecutiveOnes(int[] arr) {
    int max = 0;

    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {// as soon as '0' comes make the counter as 0
      //because this will let u count the next number of consequtive 1's
        count = 0;
      } else {
        count++;
      }
      max = Math.max(count, max);
    }
    return max;
  }
}
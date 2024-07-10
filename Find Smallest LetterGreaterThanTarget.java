class Solution {
  public char nextGreatestLetter(char[] letters, char target) {

    // Base Case
    // When the target is lesser than the first element then return the first
    // element
    // when the target is greater than the last element
    if (letters[0] > target || letters[letters.length - 1] <= target) {
      return letters[0];
    }

    int l = 0;
    int h = letters.length;
    while (l < h) {
      int mid = l + (h - l) / 2;
      if (letters[mid] > target) {
        h = mid;
      } else {
        l = mid + 1;
      }
    }
    return letters[l % letters.length];
  }
}
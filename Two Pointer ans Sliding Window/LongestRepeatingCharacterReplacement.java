import java.util.HashMap;
import java.util.Map;

class Solution {
  public int characterReplacement(String s, int k) {
    Map<Character, Integer> mpp = new HashMap<>();
    int maxlen = 0;
    int left = 0;
    int right = 0;
    int maxCount = 0; // Track the count of the most frequent character in the current window

    while (right < s.length()) {
      char rightChar = s.charAt(right);
      mpp.put(rightChar, mpp.getOrDefault(rightChar, 0) + 1);
      maxCount = Math.max(maxCount, mpp.get(rightChar));

      // If the current window size minus the count of the most frequent character is
      // greater than k,
      // it means we have more than k characters to replace, so we need to shrink the
      // window from the left
      while (right - left + 1 - maxCount > k) {
        char leftChar = s.charAt(left);
        mpp.put(leftChar, mpp.get(leftChar) - 1);
        left++;
      }

      maxlen = Math.max(maxlen, right - left + 1);
      right++;
    }
    return maxlen;
  }
}

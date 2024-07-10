//Approach -1
class Solution {
  public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int maxLength = 0;
    int[] charIndex = new int[128];
    Arrays.fill(charIndex, -1);
    int left = 0;

    for (int right = 0; right < n; right++) {
      if (charIndex[s.charAt(right)] >= left) {
        left = charIndex[s.charAt(right)] + 1;
      }
      charIndex[s.charAt(right)] = right;
      maxLength = Math.max(maxLength, right - left + 1);
    }

    return maxLength;
  }
}


//Approach -2
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        Map<Character, Integer> charset = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (charset.containsKey(c) && charset.get(c) >= left) {
                left = charset.get(c) + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            charset.put(c, right);
        }

        return maxLength;       
    }
}
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
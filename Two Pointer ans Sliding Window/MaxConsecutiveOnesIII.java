//Approach -1(Brute Force)
//Time Coomplexity: n^2
//Space Complexity: 1
class Solution {
  public int longestOnes(int[] nums, int k) {
    int n = nums.length;
    int maxlen = 0, len = 0;
    for (int i = 0; i < n; i++) {
      int zeros = 0;
      for (int j = i; j < n; j++) {
        if (nums[j] == 0) {
          zeros++;
        }
        if (zeros <= k) {
          len = j - i + 1;
          maxlen = Math.max(len, maxlen);
        } else
          break;
      }
    }
    return maxlen;
  }
}

//Approach -2(Sliding window and Two Pointer)
//Time Complexity: O(2n)
//Space Complexity: O(1)
class Solution {
  public int longestOnes(int[] nums, int k) {
    int n = nums.length;
    int zeros = 0;
    int maxlen = 0, len = 0;
    int left = 0, right = 0;
    while (right < n) {
      if (nums[right] == 0)
        zeros++;
      while (zeros > k) {
        if (nums[left] == 0)
          zeros--;
        left++;
      }
      if (zeros <= k) {
        len = right - left + 1;
        maxlen = Math.max(len, maxlen);
      }
      right++;
    }
    return maxlen;
  }
}

//Approach: 3(Two Pointer and slidinf window)
//Time Compexity: O(n)
//Space Complexity: O(1)
class Solution {
  public int longestOnes(int[] nums, int k) {
    int n = nums.length;
    int zeros = 0;
    int maxlen = 0, len = 0;
    int left = 0, right = 0;
    while (right < n) {
      if (nums[right] == 0)
        zeros++;
      if (zeros > k) {
        if (nums[left] == 0) {
          zeros--;
        }
        left++;
      }
      if (zeros <= k) {
        len = right - left + 1;
        maxlen = Math.max(len, maxlen);
      }
      right++;
    }
    return maxlen;
  }
}
//Recursive Approach: TLE
// class Solution {
//     public int tribonacci(int n) {
//         if (n == 0) {//when n=0
//             return 0;
//         } else if (n == 1 || n == 2) {//when n=1 or 2
//             return 1;
//         } else {
//             return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
//         }
//     }
// }
class Solution {
  public int tribonacci(int n) {
    Map<Integer, Integer> memo = new HashMap<>();
    return helper(n, memo);
  }

  private int helper(int n, Map<Integer, Integer> memo) {
    if (memo.containsKey(n)) {
      return memo.get(n);
    }

    int result;
    if (n == 0) {
      result = 0;
    } else if (n == 1 || n == 2) {
      result = 1;
    } else {
      result = helper(n - 1, memo) + helper(n - 2, memo) + helper(n - 3, memo);
    }

    memo.put(n, result);
    return result;
  }
}
//Approach-1: HashMaps
class Solution {
  public int singleNumber(int[] nums) {
    HashMap<Integer, Integer> freq_nums = new HashMap();
    for (int i = 0; i < nums.length; i++) {
      if (!freq_nums.containsKey(nums[i])) {
        freq_nums.put(nums[i], 1);
      } // if that key is not present in the map,so put the key in the map
      else {
        freq_nums.put(nums[i], freq_nums.get(nums[i]) + 1);
      }
    }
    for (Map.Entry<Integer, Integer> entry : freq_nums.entrySet()) {
      int key = entry.getKey();
      int value = entry.getValue();
      if (value == 1) {
        return key;
      }
    }
    return -1;
  }
}

// Approach-2
// class Solution{
// public int singleNumber(int []nums){
// int a=0;
// for (int i=0;i<nums.length;i++){
// a^=nums[i];
// }
// return a;
// }
// }

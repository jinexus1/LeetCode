class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int pos=nums.length-k;
        return nums[pos];
    }
}

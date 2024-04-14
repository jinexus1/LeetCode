class Solution {
    public int searchInsert(int[] nums, int target) {
        //Appraoch -1
          int low = 0 , high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
        //Approach-2
        // int low=0;
        // int high=nums.length-1;
        // int mid;
        // int ans=nums.length;
        // while(low<=high){
        //     mid=(high+low)/2;
        //     if(nums[mid]>=target){
        //         ans=mid;
        //         high=mid-1;
        //     }
        //     else if(target>nums[mid]){
        //         low=mid+1;
        //     }
            
            
        // }return ans;
      //both approches are same with a slight difference
    }
}

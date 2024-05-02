//Approach-1
// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> ans=new ArrayList<>();
//         ArrayList<Integer> subset=new ArrayList<>();
//         pwh(nums,0,subset,ans);
//         return ans;
//     }
//     public void pwh(int []nums,int i,ArrayList<Integer> subset,List<List<Integer>> ans){
//         if(i>=nums.length){
//             ans.add(new ArrayList<>(subset));
//             return;
//         }

//         subset.add(nums[i]);
//         pwh(nums,i+1,subset,ans);
//         subset.remove(subset.size()-1);
//         pwh(nums,i+1,subset,ans);
//     }
// }
//Approach-2
import java.util.*;

class Solution {
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();

    int subsets = 1 << nums.length;

    for (int i = 0; i < subsets; i++) {
      List<Integer> list = new ArrayList<>();
      for (int j = 0; j < nums.length; j++) {
        if ((i & (1 << j)) > 0) {
          list.add(nums[j]);
        }
      }
      ans.add(list);
    }

    return ans;
  }
}

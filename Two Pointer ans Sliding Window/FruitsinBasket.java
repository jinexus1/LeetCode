class Solution {
    public static int totalFruits(int N, int[] nums) {
        int l = 0;
        int r = 0;
        int count = 0;
        int max = 0;
        int[] frq = new int[N];
        while(r < N){
            if(frq[nums[r]]==0)   count++;
            frq[nums[r]] = frq[nums[r]] +1;
            if(count <= 2){
                max = Math.max(max, r-l+1);
            }else{
                frq[nums[l]] = frq[nums[l]] -1;
                if(frq[nums[l]] == 0) count--;
                l++;
            }
            r++;
        }
        return max;
    }
}

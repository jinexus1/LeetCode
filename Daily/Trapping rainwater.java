//date:12 April
class Solution {
    public int trap(int[] height) {
        
    int tw = 0;
    int leftmax[] = new int[height.length];
    leftmax[0] = height[0];
    // calculate leftmax boundary - array
    for (int i = 1; i < height.length; i++)
      leftmax[i] = Math.max(height[i], leftmax[i - 1]);

    // calculate rightmax boundary - array
    int rightmax[] = new int[height.length];
    rightmax[height.length - 1] = height[height.length - 1];

    for (int i = height.length - 2; i >= 0; i--)
      rightmax[i] = Math.max(height[i], rightmax[i + 1]);

    for (int i = 0; i < height.length; i++) {
      // water level(w)=min(max(of left boundary)-max(of right boundary))
      int w = Math.min(leftmax[i], rightmax[i]);// generally the width of the bar is "1"
      // water trapped(tw)=(w-x)*width of the bar
      tw += w - height[i];// x=height(i);
    }
    return tw;
    }
}

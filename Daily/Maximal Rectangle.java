//Date:13 April
public class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix==null||matrix.length==0||matrix[0].length==0)
            return 0;
        int column_length = matrix[0].length;    // column length
        int row_length = matrix.length;       // row length
        // height array 
        int[] h = new int[column_length+1];
        h[column_length]=0;
        int max = 0;
        
        
        for (int row=0;row<row_length;row++) {
            Stack<Integer> s = new Stack<Integer>();
            for (int i=0;i<column_length+1;i++) {
                if (i<column_length)
                    if(matrix[row][i]=='1')
                        h[i]+=1;
                    else h[i]=0;
                
                if (s.isEmpty()||h[s.peek()]<=h[i])
                    s.push(i);
                else {
                    while(!s.isEmpty()&&h[i]<h[s.peek()]){
                        int top = s.pop();
                        int area = h[top]*(s.isEmpty()?i:(i-s.peek()-1));
                        if (area>max)
                            max = area;
                    }
                    s.push(i);
                }
            }
        }
        return max;
    }
}

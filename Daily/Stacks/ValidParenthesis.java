//Approach-1
// class Solution {
//     public boolean checkValidString(String s) {
//         // char []c=s.toCharArray();
//         // int countOpen=0;
//         // int countClose=0;
//         // int countAsterisk=0;
//         // for(int i=0;i<c.length;i++)
//         // {
//         //     if(c[i]=='('){
//         //         countOpen++;
//         //     }
//         //     if(c[i]=='*'){
//         //         countAsterisk++;
//         //     }
//         //     if( c[i]==')'){
//         //         countClose++;
//         //     }
//         // }
//         // System.out.println(countOpen);
//         // System.out.println(countClose);
//         // System.out.println(countAsterisk);
        
//         // if(countOpen==countClose|| Math.abs(countOpen-countClose)<=countAsterisk){
//         //     return true;
//         // }
//         // return false;
//     }
// }
//Approach-2
public class Solution {
    public boolean checkValidString(String s) {
        int leftMin = 0, leftMax = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                leftMin++;
                leftMax++;
            } else if (c == ')') {
                leftMin--;
                leftMax--;
            } else {
                leftMin--;
                leftMax++;
            }
            if (leftMax < 0) return false;
            if (leftMin < 0) leftMin = 0;
        }
        
        return leftMin == 0;
    }
}

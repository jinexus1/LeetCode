//Approach-1
// package Stacks;

// public class nextGreaterElement {
//   public static void main(String[] args) {
//     int arr[]={1,3,2,1,8,6,3,4};
//     int res[]=new int[arr.length];
//     for (int i = 0; i < res.length; i++) {
//       res[i]=-1;//when there is no greater element ahead 
//       // int element=arr[i];
//       for (int j = i+1; j < res.length; j++) {
//         if(arr[j]>arr[i]){
//           res[i]=arr[j];
//           break;
//         }
//       }
//     }
//     for (int i = 0; i < res.length; i++) {
//       System.out.println(arr[i]+" ");
//     }
//     for (int i = 0; i < res.length; i++) {
//       System.out.println(res[i]+" ");
//     }

//   }
// }
//Time Complexity:O(n^2)
//Approach-2
class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n=arr.length;
        int res[]=new int[n];
        // res[n-1]=-1;
        Arrays.fill(res, -1);
        Stack <Integer> st=new Stack<>();
        //st.push(arr[n-1]);
        for(int i=n*2-1;i>=0;i--){
             while(st.size()>0 && arr[i%n]>=st.peek())
            st.pop();
            if(st.size()==0)
            res[i%n]=-1;
            else
            res[i%n]=st.peek();
            st.push(arr[i%n]);
            // if(i < n) {
            //     res[i] = st.isEmpty() ? -1 : st.peek();
            // }
            st.push(arr[i % n]);
        }
        return res;
    }
}

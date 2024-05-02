//Brute Force: Sorting
//import java.util,*;
import java.util.Arrays;
// public class Solution {
//     public static int[] getSecondOrderElements(int n, int []a) {
//         // Write your code here
//         Arrays.sort(a);
//         int largest=a[n-1];
//         int smallest=a[0];
//         int secondl=Integer.MIN_VALUE;
//         int seconds=Integer.MAX_VALUE;
//         for (int i=n-2;i>=0;i--){
//             if(a[i]!=largest){
//                 secondl=a[i];
//                 break;
//             }
//         }
//         for (int i=0;i<n;i++){
//             if(a[i]!=smallest){
//                 seconds=a[i];
//                 break;
//             }
//         }
//         int ans[]=new int[2];
// ans[0] = secondl;
// ans[1] = seconds;

//         return ans;
//     }
// }

//Approach-2: Two Variables


class Solution{
    public static int[] getSecondOrderElements(int n, int []a) {
       int sS = secondSmallest(a, n);
		int sL = secondLargest(a, n);
        int ans[]=new int[2];
        ans[0]=sL;
        ans[1]=sS;
        return ans;
        
    }
    static private int secondSmallest(int[] arr, int n)
{
	if (n < 2)
	{
		return -1;
	}
	int small = Integer.MAX_VALUE;
	int second_small = Integer.MAX_VALUE;
	int i;
	for (i = 0; i < n; i++)
	{
	   if (arr[i] < small)
	   {
		  second_small = small;
		  small = arr[i];
	   }
	   else if (arr[i] < second_small && arr[i] != small)
	   {
		  second_small = arr[i];
	   }
	}
   return second_small;
}
static private int secondLargest(int[] arr, int n)
{
	if(n<2)
	return -1;
	int large = Integer.MIN_VALUE;
	int second_large = Integer.MIN_VALUE;
	int i;
	for (i = 0; i < n; i++)
	{
		if (arr[i] > large)
		{
			second_large = large;
			large = arr[i];
		}

		else if (arr[i] > second_large && arr[i] != large)
		{
			second_large = arr[i];
		}
	}
	return second_large;
}

}
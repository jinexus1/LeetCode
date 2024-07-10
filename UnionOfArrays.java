import java.util.ArrayList;

class Solution {
  // Function to return a list containing the union of the two arrays.
  public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
    ArrayList<Integer> arr = new ArrayList<>();
    int left = 0, right = 0;
    int lastAdded = Integer.MIN_VALUE; // To keep track of the last added element to avoid duplicates

    while (left < n && right < m) {
      if (arr1[left] <= arr2[right]) {
        if (arr1[left] != lastAdded) {
          arr.add(arr1[left]);
          lastAdded = arr1[left];
        }
        left++;
      } else {
        if (arr2[right] != lastAdded) {
          arr.add(arr2[right]);
          lastAdded = arr2[right];
        }
        right++;
      }
    }

    // Adding remaining elements of arr1
    while (left < n) {
      if (arr1[left] != lastAdded) {
        arr.add(arr1[left]);
        lastAdded = arr1[left];
      }
      left++;
    }

    // Adding remaining elements of arr2
    while (right < m) {
      if (arr2[right] != lastAdded) {
        arr.add(arr2[right]);
        lastAdded = arr2[right];
      }
      right++;
    }

    return arr;
  }
}

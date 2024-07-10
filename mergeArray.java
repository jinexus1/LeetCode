class Solution {
  // Function to return a list containing the union of the two arrays.
  void merge(int arr1[],int arr2[],int n,int m) {
    int temp;
    int left = n - 1, right = 0;
    while (left >= 0 && left < m) {
      if (arr1[left] > arr2[right]) {
        temp = arr1[left];
        arr1[left] = arr2[right];
        arr2[right] = temp;
        left--;
        right++;
      }

    }
    // Adding remaining elements of arr1
    Arrays.sort(arr1);
    Arrays.sort(arr2);
  }
}
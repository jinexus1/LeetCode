//Approach-1: Count the number of 0's, 1's, 2's and then just print them in a sequential order 
//0 followed by 1 and 1 followed by 2 simultaneously reducting the counter of each
class Solution {
  // Function to sort a linked list of 0s, 1s and 2s.
  static Node segregate(Node head) {
    // add your code here
    int count_zero = 0, count_one = 0, count_two = 0;
    Node temp = head;
    while (temp != null) {
      if (temp.data == 0) {
        count_zero++;
      }
      if (temp.data == 1) {
        count_one++;
      }
      if (temp.data == 2) {
        count_two++;
      }
      temp = temp.next;
    }
    temp = head;
    while (temp != null) {
      if (count_zero > 0) {
        temp.data = 0;
        count_zero--;
      } else if (count_one > 0) {
        temp.data = 1;
        count_one--;
      } else if (count_two > 0) {
        temp.data = 2;
        count_two--;
      }
      temp = temp.next;
    }
    return head;
  }
}

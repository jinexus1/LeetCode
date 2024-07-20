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


//Approach 2: we make dummynode for each zero one two and one, as soon as we get encounter 
//zero we point the zerosHead.next to temp and update it to zero.next for new zero if
//a zero is encountered, this process is done for all the nodes untill temp!=null

//Advantage: Done in single traversal
class Solution {
  // Function to sort a linked list of 0s, 1s and 2s.
  static Node segregate(Node head) {
    if (head == null || head.next == null)
      return head;

    // Dummy nodes for 0s, 1s and 2s
    // dummy nodes
    Node zeroHead = new Node(-1);
    Node oneHead = new Node(-1);
    Node twoHead = new Node(-1);

    // Current pointers for the three lists
    Node zero = zeroHead, one = oneHead, two = twoHead;

    // Traverse the list and connect nodes to corresponding lists
    Node temp = head;
    while (temp != null) {
      if (temp.data == 0) {
        zero.next = temp;// pointing the zero to temp
        zero = zero.next;// now shifiting the pointer
      } else if (temp.data == 1) {
        one.next = temp;// pointing the one to temp
        one = one.next;// now shifiting the pointer
      } else if (temp.data == 2) {
        two.next = temp;// pointing the one two to temp
        two = two.next;// now shifiting the pointer
      }
      temp = temp.next;
      // moving the temp pointer to the next node
    }

    // Connect the three lists
    // If there are no ones then connect the zero list to twoHead
    zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
    one.next = twoHead.next;
    two.next = null;

    // The head of the new list
    head = zeroHead.next;

    return head;
  }
} 
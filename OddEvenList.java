//Approach: Make a linked list of even and odd node
//then point the odd list pointer to even list head
class Solution {
  public ListNode oddEvenList(ListNode head) {
    // When the list contain only no or one element
    if (head == null || head.next == null)
      return head;
    // Creating an Odd list
    ListNode odd = new ListNode(0);
    // Initializing the pointer of odd list
    ListNode odd_ptr = odd;
    // Creating an Even list
    ListNode even = new ListNode(0);
    // Initializing the pointer of even list
    ListNode even_ptr = even;

    int idx = 1;
    while (head != null) {
      if (idx % 2 == 0) {
        even_ptr.next = head;
        even_ptr = even_ptr.next;
      } else {
        odd_ptr.next = head;
        odd_ptr = odd_ptr.next;
      }
      head = head.next;
      idx++;
    }
    // Since we are adding the even list at the end so the last element of even
    // list points to null
    even_ptr.next = null;
    // connecting the odd list to the even list
    odd_ptr.next = even.next;
    return odd.next;
  }
}
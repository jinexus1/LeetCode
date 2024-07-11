/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode cur = head;

    // if the list contain only one element or no element
    if (head == null || head.next == null) {
      return head;
    }
    ListNode next = head.next;
    while (cur != null) {
      cur.next = prev;// changing the link from pointing to next
      // to the previous link
      prev = cur;// now the prev to current node
      cur = next;// shifting the current pointer to next
      if (next == null) {
        break;
      }
      next = next.next;// now the next is shifted the next's next
    }
    return prev;
  }
}
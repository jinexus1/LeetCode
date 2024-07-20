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
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    if (l1 == null && l2 == null)
      return null;
    ListNode temp1 = l1;
    ListNode temp2 = l2;
    ListNode dummyNode = new ListNode(-1);
    ListNode curr = dummyNode;
    int carry = 0;

    while (temp1 != null || temp2 != null) {
      int sum = 0;
      if (temp1 != null) {
        sum = sum + temp1.val;
        temp1 = temp1.next;
      }
      if (temp2 != null) {
        sum = sum + temp2.val;
        temp2 = temp2.next;
      }
      sum = sum + carry;
      ListNode newNode = new ListNode(sum % 10);
      carry = sum / 10;
      curr.next = newNode;
      curr = curr.next;
      // creating a new node if carry is left
      if (carry > 0) {
        newNode = new ListNode(carry);
        curr.next = newNode;
      }
    }
    return dummyNode.next;
  }
}
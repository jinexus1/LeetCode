//Approach 1: reverse add 1 then again revese 
//Time Complexity=O(3n)
class Solution {
  Node reverse(Node node) {
    Node prev = null;
    Node curr = node;
    while (curr != null) {
      Node next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return prev;
  }

  public Node addOne(Node head) {
    // code here.
    head = reverse(head);
    Node temp = head;
    int carry = 1;
    while (temp != null) {
      temp.data = temp.data + carry;
      if (temp.data < 10) {
        carry = 0;
        break;
      } else {
        temp.data = 0;
        carry = 1;
      }
      temp = temp.next;
    }
    if (carry == 1) {
      Node newNode = new Node(1);
      head = reverse(head);
      newNode.next = head;
      return newNode;
    }
    head = reverse(head);
    return head;
  }
}

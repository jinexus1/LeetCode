/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//Appraoch 1: Push the element of linked list into stack and  then check the top of stack if equal to linked  List 
//element
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st =new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null && !st.isEmpty()){
            if(temp.val!=st.pop())
                return false;
            temp=temp.next;
        }
        return true;
    }
}
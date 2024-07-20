class Solution {
  public String reverseParentheses(String s) {
    Stack<Character> st = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      // check whether it is closing bracket
      if (s.charAt(i) == ')') {
        Queue<Character> q = new LinkedList();
        // untill open bracket remove from stack
        // and push into queue
        while (st.peek() != '(') {
          q.add(st.pop());// popping and adding to queue
        }
        st.pop();// removing opening bracket
        // adding the characters from queue back to stack
        // for another paranethesis pair left
        while (q.size() > 0) {
          st.push(q.remove());
          // add back to queue in FIFO manner
        }
      }
      // When it open bracket or a character
      else {
        st.push(s.charAt(i));
      }
    }
    // finally filling the characters as the return type is String
    char[] ans = new char[st.size()];
    for (int i = ans.length - 1; i >= 0; i--) {
      ans[i] = st.pop();
      // filling the character in reverse order
    }

    return new String(ans);
  }
}
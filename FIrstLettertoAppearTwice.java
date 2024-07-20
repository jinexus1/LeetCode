import java.util.HashSet;
import java.util.Set;

class Solution {
  public char repeatedCharacter(String s) {
    Set<Character> st = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      if (st.contains(s.charAt(i))) {
        return s.charAt(i);
      }
      st.add(s.charAt(i));
    }
    return '\0'; // or any other special character to indicate no repetition
  }
}

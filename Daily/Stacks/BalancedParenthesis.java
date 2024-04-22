package Stacks;
import java.util.*;
public class BalancedParenthesis {
  public static boolean isValid(String str){
    Stack<Character> st=new Stack<>();
    int l=str.length();
    for (int i = 0; i < l; i++) {
      char ch=str.charAt(i);
      if(ch=='(')
      st.push(ch);
      else{
        if(st.size()==0) return false;
        if(st.peek()=='(') st.pop();
      }
    }
    if(st.size()>0) return false;
    return true;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    System.out.println(isValid(str));
  }
}

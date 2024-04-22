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
  public static int removeParenTOMakeITBalanced(String str){
    Stack<Character> st=new Stack<>();
    int ans=0;
    int l=str.length();
    for (int i = 0; i < l; i++) {
      char ch=str.charAt(i);
      if(ch=='(')
      st.push(ch);
      else{
        if(st.size()==0) ans+=1
        if(st.peek()=='(') st.pop();
      }
    }
    if(st.size()>0) ans+=st.size();
    return ans
  } 
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    
    if(!isValid(str)){
      int ans=removeParenTOMakeITBalanced(str);
      System.out.println("To make it balanced we need to remove "+ans+" number of parenthesis");
    }
    else{
      System.out.println(isValid(str));
    }
  }
}
/*
In the above given code we need to find out whether the given input has valid parenthesis or not, if not the 
we need to find out the number of parenthesis which we need to remove to get the valid parenthesis
*/

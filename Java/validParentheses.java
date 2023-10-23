import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>(); 
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else if (!stack.empty()) {
                if (s.charAt(i) == ')' && stack.peek().equals('(')) {
                    stack.pop();
                } else if (s.charAt(i) == ']' && stack.peek().equals('[')) {
                    stack.pop();
                } else if (s.charAt(i) == '}' && stack.peek().equals('{')) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }     
        }

        if (stack.empty()) { 
            return true;
        }

        return false;
    }
}

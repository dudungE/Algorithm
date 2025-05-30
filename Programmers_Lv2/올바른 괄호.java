import java.util.EmptyStackException;
import java.util.Stack;

class Solution {
    boolean solution(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') stack.push('(');
            try {
                if (c == ')') stack.pop();
            } catch (EmptyStackException e) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
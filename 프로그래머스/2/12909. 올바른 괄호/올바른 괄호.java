import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = false;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
        	if (s.charAt(i) == ')') {
        		if (stack.size() == 0 || stack.peek() == ')') return false;
        		else if (stack.peek() == '(') stack.pop();
        	}
        	else stack.add('(');
        }
        
        if (stack.size() == 0) answer = true;

        return answer;
    }
}
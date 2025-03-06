import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        Stack<Character> stack;

        for (int i = 0; i < len; i++) {
            stack = new Stack<>();

            for (int j = 0; j < len; j++) {
                char ch = s.charAt((i + j) % len);
                if (stack.isEmpty()) stack.push(ch);
                else if (ch == ')' && stack.peek() == '(') stack.pop();
                else if (ch == '}' && stack.peek() == '{') stack.pop();
                else if (ch == ']' && stack.peek() == '[') stack.pop();
                else stack.push(ch);
            }

            if (stack.isEmpty()) answer++;
        }

        return answer;
    }
}
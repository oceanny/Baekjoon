import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            while (stack.size() > 1) {
                char ch = stack.pop();
                char new_ch = stack.peek();
                if (ch == new_ch) stack.pop();
                else stack.push(ch);

                if (ch != new_ch) break;
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
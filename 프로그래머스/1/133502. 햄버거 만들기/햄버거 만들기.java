import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < ingredient.length; i++) {
        	stack.add(ingredient[i]);
        	
        	while (stack.size() >= 4) {
        		int a = stack.pop();
        		int b = stack.pop();
        		int c = stack.pop();
        		int d = stack.pop();
        		
        		if (a == 1 && b == 3 && c == 2 && d == 1) {
        			answer++;
        		}
        		else {
        			stack.add(d);
        			stack.add(c);
        			stack.add(b);
        			stack.add(a);
        			break;
        		}
        	}
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < moves.length; i++) {
        	int idx = moves[i] - 1;
        	for (int j = 0; j < board.length; j++) {
        		if (board[j][idx] != 0) {
        			stack.add(board[j][idx]);
        			board[j][idx] = 0;
        			break;
        		}
        	}
        	
        	while(stack.size() >= 2) {
        		int tmp1 = stack.pop();
        		int tmp2 = stack.peek();
        		
        		if (tmp1 == tmp2) {
        			stack.pop();
        			answer++;
        		}
        		else {
        			stack.add(tmp1);
        			break;
        		}
        	}
        }
        return answer * 2;
    }
}
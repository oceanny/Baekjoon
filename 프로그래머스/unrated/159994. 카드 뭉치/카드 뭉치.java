import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();
        String answer = "No";
        int count = 0;
        
        for (int i = 0; i < cards1.length; i++) {
        	q1.add(cards1[i]);
        }
        
        for (int i = 0; i < cards2.length; i++) {
        	q2.add(cards2[i]);
        }
        
        while(count < goal.length && (!q1.isEmpty() || !q2.isEmpty())) {
        	if (!q1.isEmpty() && goal[count].equals(q1.peek())) {
        		q1.poll();
        		count++;
        		continue;
        	}
        	else if (!q2.isEmpty() && goal[count].equals(q2.peek())) {
        		q2.poll();
        		count++;
        		continue;
        	}
        	else return answer;
        }
        
        if (count == goal.length || (q1.isEmpty() && q2.isEmpty())) answer = "Yes";
        
        return answer;
    }
}
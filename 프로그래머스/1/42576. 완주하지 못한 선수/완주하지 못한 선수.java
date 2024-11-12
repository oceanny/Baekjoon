import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = participant[0];
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for (int i = 0; i < completion.length; i++) {
        	if (!participant[i].equals(completion[i])) {
        		answer = participant[i];
        		break;
        	}
        }
        return answer;
    }
}
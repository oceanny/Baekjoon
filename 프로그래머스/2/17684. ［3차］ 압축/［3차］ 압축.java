import java.util.*;

class Solution {
    public int[] solution(String msg) {
        int[] answer;
        List<Integer> ans = new ArrayList<>();
        List<String> index = new ArrayList<>();
        
        for (int i = 1; i <= 26; i++) {
        	index.add(Character.toString(64 + i));
        }
        
        for (int i = 0; i < msg.length(); i++) {
    		int cnt = 2;
    		while (true) {
    			if (i + cnt == msg.length()) {
    				if (index.contains(msg.substring(i, i + cnt))) break;
    				else {
    					cnt--;
    					break;
    				}
    			}
    			else if (i + cnt > msg.length()) {
    				cnt--;
    				break;
    			}
    			
    			if (index.contains(msg.substring(i, i + cnt))) {
    				cnt++;
    			}
    			else {
    				index.add(msg.substring(i, i + cnt));
    				cnt--;
    				break;
    			}
    		}
    		ans.add(index.indexOf(msg.substring(i, i + cnt)) + 1);
    		i += cnt - 1;
    	}
        
        answer = new int[ans.size()];
        
        for (int i = 0; i < ans.size(); i++) {
        	answer[i] = ans.get(i);
        }
        return answer;
    }
}
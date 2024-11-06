class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int chk = 1;
        char key = s.charAt(0);
        int cnt = 0;
        
        for (int i = 1; i < s.length(); i++) {
        	if (i == s.length() - 1) return answer + 1;
        	if (s.charAt(i) == key) chk++;
        	else {
        		cnt++;
        		
        		if (chk == cnt) {
        			i += 1;
        			answer++;
        			
        			if (i > s.length() - 1) return answer;
        			if (i == s.length() - 1) return answer + 1;
        			
        			chk = 1;
        			cnt = 0;
        			key = s.charAt(i);
        		}
        		
        	}
        }
        
        if (answer == 0) answer = 1;
        return answer;
    }
}
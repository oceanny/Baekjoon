class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
        	char tmp = s.charAt(i);
        	for (int j = 0; j < index; j++) {
        		tmp += 1;
        		if (tmp > 122) tmp -= 26;
        		while (skip.contains(Character.toString(tmp))) {
        			tmp += 1;
        			if (tmp > 122) tmp -= 26;
        		}
        	}
        	answer += tmp;
        }
        
        return answer;
    }
}
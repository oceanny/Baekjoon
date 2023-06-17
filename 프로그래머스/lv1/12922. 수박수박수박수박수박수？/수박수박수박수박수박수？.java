class Solution {
    public String solution(int n) {
        String answer = "";
		int i = 1;
		while (i <= n) {
			if (i % 2 == 1) answer += "수";
			else answer += "박";
			i++;
		}

		return answer;
    }
}
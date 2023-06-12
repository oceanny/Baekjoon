class Solution {
    public int solution(int num) {
        int answer = 0;
        boolean flag = true;
        long temp = num;
        
        if (temp == 1) flag = false;
        
        while (flag) {
        	if (temp % 2 == 0) temp /= 2;
        	else temp = temp * 3 + 1;
        	answer++;
        	
        	if (answer == 500) {
        		flag = false;
        		answer = -1;
        		return answer;
        	}
        	
        	if (temp == 1) {
        		flag = false;
        		return answer;
        	}
        }
        return answer;
    }
}
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
//        	약수는 본인 포함이므로 temp는 1로 시작
        	int temp = 1;
        	for (int j = 1; j <= i / 2; j++) {
        		if (i % j == 0) temp++;
        	}
        	if (temp % 2 == 0) answer += i;
        	else answer -= i;
        }
        return answer;
    }
}
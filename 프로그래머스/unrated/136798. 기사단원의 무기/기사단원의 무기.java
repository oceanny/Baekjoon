class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] weight = new int[number + 1];
        for (int i = 1; i <= number; i++) {
        	int num = i;
        	int j = 1;
        	while (num <= number && j <= number / num) {
        		weight[num * j]++;
        		j++;
        	}
        }
        for (int i = 1; i <= number; i++) {
        	if (weight[i] > limit) weight[i] = power;
        	answer += weight[i];
        }
        return answer;
    }
}
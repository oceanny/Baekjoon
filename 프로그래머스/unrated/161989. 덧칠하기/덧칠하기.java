class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] paint = new boolean[section.length];
        for (int i = 0; i < section.length; i++) {
        	if (paint[i]) continue;
        	int temp = section[i] + m - 1;
        	for (int j = i; j < section.length; j++) {
        		if (section[j] <= temp) paint[j] = true;
        		else break;
        	}
        	answer++;
        }
        return answer;
    }
}
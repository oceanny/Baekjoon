class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				int temp = 0;
				if (d[i] > d[j]) {
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}
		for (int i = 0; i < d.length; i++) {
			if (budget - d[i] >= 0) {
				budget = budget - d[i];
				answer++;
			}
			else
				break;
		}
        return answer;
    }
}
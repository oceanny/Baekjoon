class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
		
		int t = bandage[0];
		int x = bandage[1];
		int y = bandage[2];
		
		int now = 1;
		int cnt = 0;
		for (int i = 0; i < attacks.length; i++) {
			int time = attacks[i][0];
			int damage = attacks[i][1];
			
			for (int j = now; j < time; j++) {
				cnt++;
				if (answer >= health) {
					answer = health;
					continue;
				}
				answer += x;
				if (cnt == t) {
					answer += y;
					cnt = 0;
				}
			}
			
			answer -= damage;
			now = time + 1;
			cnt = 0;
			if (answer <= 0) return -1;
		}
		return answer;
    }
}
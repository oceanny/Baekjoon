import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
		Arrays.sort(lottos);
		Arrays.sort(win_nums);
		int zeros = 0;
		int ans = 0;
		int rank = 0;
		for (int i = 0; i < 6; i++) {
			if (lottos[i] == 0)
				zeros++;
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (lottos[i] == win_nums[j]) {
					ans++;
					break;
				} else if (lottos[i] < win_nums[j]) {
					break;
				}
			}
		}
		switch (ans) {
		case 0:
			rank = 6;
			break;
		case 1:
			rank = 6;
			break;
		case 2:
			rank = 5;
			break;
		case 3:
			rank = 4;
			break;
		case 4:
			rank = 3;
			break;
		case 5:
			rank = 2;
			break;
		case 6:
			rank = 1;
			break;
		}
		
		if (rank - zeros < 1) answer[0] = 1;
		else if (rank == 6 && ans == 0 && zeros != 0) answer[0] = rank - zeros + 1;
		else answer[0] = rank - zeros;
		answer[1] = rank;
		return answer;
    }
}
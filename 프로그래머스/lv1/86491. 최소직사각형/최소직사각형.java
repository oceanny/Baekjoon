class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
		int length = sizes.length;
		for (int i = 0; i < length; i++) {
			if (sizes[i][0] < sizes[i][1]) {
				int temp = sizes[i][0];
				sizes[i][0] = sizes[i][1];
				sizes[i][1] = temp;
			}
		}

		int w_max = sizes[0][0];
		int h_max = sizes[0][1];

		for (int i = 1; i < length; i++) {
			if (sizes[i][0] > w_max)
				w_max = sizes[i][0];
			if (sizes[i][1] > h_max)
				h_max = sizes[i][1];
		}

		answer = w_max * h_max;

		return answer;
    }
}
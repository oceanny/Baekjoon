import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;

		Arrays.sort(mats);
		int rows = park.length;
		int cols = park[0].length;

		for (int i = mats.length - 1; i >= 0; i--) {
			int val = mats[i];
			for (int j = 0; j < rows; j++) {
				a: for (int k = 0; k < cols; k++) {
					if (park[j][k].equals("-1") && j + val <= rows && k + val <= cols) {
						for (int l = j; l < j + val; l++) {
							for (int n = k; n < k + val; n++) {
								if (!park[l][n].equals("-1"))
									continue a;
							}
						}

						return val;
					}
				}
			}
		}

		return answer;
    }
}
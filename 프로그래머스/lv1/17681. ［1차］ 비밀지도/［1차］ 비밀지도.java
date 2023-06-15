class Solution {
    public static String[] findMap(int n, int[] arr1, int[] arr2) {
		// 정답 배열
		String[] answer = new String[n];
		// #을 나눠서 저장할 배열
		String[][] ans = new String[n][n];

		for (int i = 0; i < n; i++) {
			answer[i] = "";
			String temp = Integer.toBinaryString(arr1[i]);
			String temp2 = Integer.toBinaryString(arr2[i]);
			// 2진수 변환 후 자릿수를 맞춤
			while(temp.length() < n) {
				temp = "0" + temp;
			}
			while(temp2.length() < n) {
				temp2 = "0" + temp2;
			}

			// 2진수 배열에 한 자리씩 배정
			String arr1_new[] = temp.split("");
			String arr2_new[] = temp2.split("");

			for (int j = 0; j < n; j++) {
				// 두 배열 값에 따라 #과 공백 배정
				if (arr1_new[j].equals("1") || arr2_new[j].equals("1"))
					ans[i][j] = "#";
				else
					ans[i][j] = " ";
			
				answer[i] = answer[i] + ans[i][j];
			}

		}
		return answer;
	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = {};
		answer = findMap(n, arr1, arr2);
		return answer;
	}
}
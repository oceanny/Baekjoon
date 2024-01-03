class Solution {
    public int solution(String dartResult) {
        int answer = 0;
		char[] arr = dartResult.toCharArray();
		int[] point = new int[3];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 58 && arr[i] > 48) {
				point[count] = arr[i] - '0';
				count++;
				continue;
			}
            else if (arr[i] == '0' && i > 0 && arr[i - 1] == '1') {
				point[count - 1] = 10;
				continue;
			}
			else if (arr[i] == '0'){
				point[count] = 0;
				count++;
				continue;
			}
			switch (arr[i]) {
			case 'S':
				break;
			case 'D':
				point[count - 1] *= point[count - 1];
				break;
			case 'T':
				point[count - 1] *= point[count - 1] * point[count - 1];
				break;
			case '*':
				if (count >= 2) {
					point[count - 2] *= 2;
					point[count - 1] *= 2;
				}
				else point[count - 1] *= 2;
				break;
			case '#':
				point[count - 1] *= -1;
				break;
			}
		}
		
		answer = point[0] + point[1] + point[2];

		return answer;
    }
}
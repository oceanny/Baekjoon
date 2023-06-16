import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int index = 0;
		if (arr.length == 1) {
			int[] answer = { -1 };
			return answer;
		} else {
			int[] answer = new int[arr.length - 1];
			int[] temp = new int[arr.length];
			for (int i = 0; i < temp.length; i++) {
				temp[i] = arr[i];
			}

			Arrays.sort(temp);
			for (int i = 0; i < temp.length; i++) {
				if (arr[i] == temp[0]) {
					index = i;
					break;
				}
			}

			for (int i = 0; i < temp.length; i++) {
				if (i < index)
					answer[i] = arr[i];
				else if (i == index)
					continue;
				else
					answer[i - 1] = arr[i];
			}
			return answer;
		}
    }
}
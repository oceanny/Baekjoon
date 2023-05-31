import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
		int temp = arr[0];
		int num = 1;

		for (int i = 0; i < arr.length - 1; i++) {
			if (temp != arr[i + 1]) {
				num = num + 1;
				temp = arr[i + 1];
			}
		}
		
		answer = new int[num];
		answer[0] = arr[0];
		num = 1;
		for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
				answer[num] = arr[i + 1];
				num = num + 1;
			}
		}
        return answer;
    }
}
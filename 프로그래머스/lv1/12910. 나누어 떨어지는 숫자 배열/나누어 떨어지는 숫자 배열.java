import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        String str = "";
        String[] temp;
        
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] % divisor == 0) {
        		str += arr[i] + " ";
        	}
        }
        
        if (str.equals("")) {
        	int[] answer = {-1};
        	return answer;
        	}
        else {
        	temp = str.split(" ");
        	int[] answer = new int[temp.length];
        	for (int i = 0; i < temp.length; i++) {
        		answer[i] = Integer.parseInt(temp[i]);
        	}
        	Arrays.sort(answer);
        	return answer;
        }
    }
}
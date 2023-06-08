class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
		int y = 0;
		char[] arr = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
			int temp = 0;
			if (arr[i] > 90) temp = arr[i] - 32;
			else temp = arr[i];
			
			if (temp == 80) p++;
			else if (temp == 89) y++;
			
		}
		
		if (p != y) answer = false;

        return answer;
    }
}
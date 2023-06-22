class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {
			if (s.substring(0, i).contains("" + s.charAt(i))) {
				int temp = s.lastIndexOf(s.charAt(i), i - 1);
				answer[i] = i - temp;
			} else {
				answer[i] = -1;			
			}
		}
		return answer;
    }
}
class Solution {
    public long solution(long n) {
        String str = "" + n;
		int[] num = new int[str.length()];
		long answer = 0;
		
		for (int i = 0; i < str.length(); i++) {
			num[i] = str.charAt(i) - '0';
		}
		
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				int temp = 0;
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		str = "";
		for (int i = num.length - 1; i >= 0; i--) {
			str += num[i];
		}
		
		answer = Long.parseLong(str);
        return answer;
    }
}
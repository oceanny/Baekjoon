class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
		int[] alphabet = new int[26];

		for (int i = 0; i < 26; i++) {
			alphabet[i] = Integer.MAX_VALUE;
		}

		for (int i = 0; i < keymap.length; i++) {
			String str = keymap[i];
			for (int j = 0; j < str.length(); j++) {
				int index = str.charAt(j) - 65;
				alphabet[index] = Math.min(alphabet[index], j + 1);
			}
		}

		for (int i = 0; i < targets.length; i++) {
			String str = targets[i];
			int ans = 0;
			for (int j = 0; j < str.length(); j++) {
				int index = str.charAt(j) - 65;

				if (alphabet[index] > 100) {
					ans = -1;
					break;
				}

				ans += alphabet[index];
			}
			answer[i] = ans;
		}

		return answer;
    }
}
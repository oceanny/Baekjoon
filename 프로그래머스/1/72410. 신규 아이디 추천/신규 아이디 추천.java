class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase().replaceAll("[^0-9a-z-_.]", "")
				.replaceAll("[.]{2,}", ".").replaceAll("^[.]|[.]$", "");
		
		if (answer.length() < 1) answer = "aaa";
        if (answer.length() > 15) {
			answer = answer.substring(0, 15);
			answer = answer.replaceAll("[.]$", "");
		}
		if (answer.length() < 3) {
			String str = answer.substring(answer.length() - 1);
			while (answer.length() < 3) {
				answer += str;
			}
		}
        return answer;
    }
}
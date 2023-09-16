class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
        	boolean check = false;
        	String[] str = babbling[i].split("aya|ye|woo|ma");
        	if (str.length == 0) check = true;
        	if (babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo") || babbling[i].contains("mama")) check = false;
        	if (check) answer++;
        }
        return answer;
    }
}
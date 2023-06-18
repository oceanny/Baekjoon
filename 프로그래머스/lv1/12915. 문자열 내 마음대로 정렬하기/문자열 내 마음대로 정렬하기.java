import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = strings;
        Arrays.sort(answer, new Comparator<String>() {
        	public int compare(String s1, String s2) {
//        		음수인 경우 유지, 양수인 경우 변경
        		if (s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
        		else return s1.charAt(n) - s2.charAt(n);
        	}
        });
        return answer;
    }
}
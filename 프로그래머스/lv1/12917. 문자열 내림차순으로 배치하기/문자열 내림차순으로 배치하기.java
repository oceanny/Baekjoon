import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] temp = s.split("");
        Arrays.sort(temp, Collections.reverseOrder());
        for (int i = 0; i < temp.length; i++) {
        	answer += temp[i];
        }
        return answer;
    }
}
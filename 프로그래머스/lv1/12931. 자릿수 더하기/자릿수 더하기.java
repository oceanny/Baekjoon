import java.util.*;

public class Solution {
    public int solution(int n) {
		//변수 선언 및 초기화
        String num = "";
        int answer = 0;
        //입력
        num = num + n;
        //처리
        for(int i = 0; i < num.length(); i++){
            answer = answer + (num.charAt(i) - '0');    //char 문자에서 아스키코드 0을 빼면 숫자를 얻을 수 있다
        }
        //출력
        return answer;
    }
}
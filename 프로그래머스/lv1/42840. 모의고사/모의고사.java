import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {
    public int[] solution(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
		int[] answer = {};
		int[] st1 = { 1, 2, 3, 4, 5 };
		int[] st2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] st3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int temp = 0;
		String tempStr = "";
		
		// 수포자 별 정답을 맞힌 수를 map에 저장
		for (int i = 0; i < answers.length; i++) {
			if (st1[i % st1.length] == answers[i])
				temp++;
		}
		map.put(1, temp);
		temp = 0;
		for (int i = 0; i < answers.length; i++) {
			if (st2[i % st2.length] == answers[i])
				temp++;
		}
		map.put(2, temp);
		temp = 0;
		for (int i = 0; i < answers.length; i++) {
			if (st3[i % st3.length] == answers[i])
				temp++;
		}
		map.put(3, temp);
		
		// 정답 맞힌 수의 최대값 구하기
		int max = Math.max(Math.max(map.get(1), map.get(2)), map.get(3));
		// map에서 max보다 작은 value를 가진 key, value를 삭제
		map.values().removeIf(num -> num < max);
		// tempStr에 map에 존재하는 key값 저장
		Iterator<Integer> key = map.keySet().iterator();
		while (key.hasNext()) {
			tempStr += key.next();
		}
		// 수포자의 범위는 1~3으로 글자 수가 정해져 있어 charAt을 이용해 answer에 저장
		answer = new int[tempStr.length()];
		for (int i = 0; i < tempStr.length(); i++) {
			answer[i] = tempStr.charAt(i) - '0';
		}
		// 오름차순 정렬
		Arrays.sort(answer);
		
		return answer;
    }
}